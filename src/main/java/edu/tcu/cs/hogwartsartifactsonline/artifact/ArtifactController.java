package edu.tcu.cs.hogwartsartifactsonline.artifact;

import org.springframework.web.bind.annotation.*;
import edu.tcu.cs.hogwartsartifactsonline.system.Result;

@RestController
public class ArtifactController {

    private final ArtifactService artifactService;


    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

    @GetMapping("/api/v1/artifacts/{artifactId}")
    public Result findArtifactById(@PathVariable String artifactId) {
        return null;
    }
}
