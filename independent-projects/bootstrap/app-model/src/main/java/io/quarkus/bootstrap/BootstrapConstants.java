package io.quarkus.bootstrap;

import io.quarkus.bootstrap.model.AppArtifactCoords;

/**
 *
 * @author Alexey Loubyansky
 */
public interface BootstrapConstants {

    String SERIALIZED_APP_MODEL = "quarkus-internal.serialized-app-model.path";
    String DESCRIPTOR_FILE_NAME = "quarkus-extension.properties";

    @Deprecated
    String EXTENSION_PROPS_JSON_FILE_NAME = "quarkus-extension.json";

    String QUARKUS_EXTENSION_FILE_NAME = "quarkus-extension.yaml";

    String META_INF = "META-INF";

    String DESCRIPTOR_PATH = META_INF + '/' + DESCRIPTOR_FILE_NAME;

    String PROP_DEPLOYMENT_ARTIFACT = "deployment-artifact";
    String PARENT_FIRST_ARTIFACTS = "parent-first-artifacts";
    String EXCLUDED_ARTIFACTS = "excluded-artifacts";
    String LESSER_PRIORITY_ARTIFACTS = "lesser-priority-artifacts";

    String EMPTY = "";
    String JAR = AppArtifactCoords.TYPE_JAR;
    String POM = AppArtifactCoords.TYPE_POM;
}
