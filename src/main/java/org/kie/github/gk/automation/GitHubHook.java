package org.kie.github.gk.automation;

import org.kie.github.gk.automation.models.PullRequestEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GitHubHook {

    private static final Logger LOG = LoggerFactory.getLogger( HookResource.class );

    public void onPullRequest( final PullRequestEvent event ) throws Exception {
        LOG.error( "PR EVENT: " + event.toString() );
    }

}
