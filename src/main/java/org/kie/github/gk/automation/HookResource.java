package org.kie.github.gk.automation;

import java.io.IOException;
import java.io.InputStream;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.kie.github.gk.automation.models.Payload;
import org.kie.github.gk.automation.models.PullRequestEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.uberfire.commons.validation.PortablePreconditions.*;

@Path("hook")
public class HookResource {

    private static final Logger LOG = LoggerFactory.getLogger( HookResource.class );

    @Inject //Resteasy doesn't seem to support con
    private GitHubHook hook;
    private ObjectMapper objectMapper = new ObjectMapper();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response onGitHubPost( @HeaderParam("HTTP_X_GITHUB_EVENT") final String event,
                                  @Context final HttpServletRequest request ) throws IOException {

        try {
            checkNotNull( "request", request );
            checkNotNull( "event", event );
        } catch ( final IllegalArgumentException e ) {
            throw new BadRequestException( e );
        }

        try ( final InputStream in = request.getInputStream() ) {
            Payload.EventType type = Payload.EventType.valueOf( event.toUpperCase() );

            switch ( type ) {
                case PULL_REQUEST:
                    hook.onPullRequest( objectMapper.readValue( in, PullRequestEvent.class ) );
                    break;
                default:
                    LOG.info( "Unimplemented hook " + type );
                    break;
            }

            return Response.ok().build();
        } catch ( JsonParseException | JsonMappingException e ) {
            LOG.warn( e.getMessage(), e );
            throw new InternalServerErrorException( e.getMessage(), Response
                    .status( Status.INTERNAL_SERVER_ERROR )
                    .entity( e.getMessage() + "\n" ).build(), e );
        } catch ( IllegalArgumentException e ) {
            throw new BadRequestException( e );
        } catch ( Exception e ) {
            throw new InternalServerErrorException( Response
                                                            .status( Status.INTERNAL_SERVER_ERROR )
                                                            .entity( e.getMessage() ).build(), e );
        }
    }

}
