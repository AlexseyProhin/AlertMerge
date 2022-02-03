package letscode.github;

import org.kohsuke.github.GHMyself;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
public class GitHubJob {
    private final GitHub gitHub;
    private final Gui gui = new Gui();

    public GitHubJob() {
        try {
            gitHub = new GitHubBuilder()
                    .withAppInstallationToken(System.getenv("GITHUB_TOKEN"))
                    .build();
            init();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void init() throws IOException {
        GHMyself myself = gitHub.getMyself();
        String login = myself.getLogin();

    }
}
