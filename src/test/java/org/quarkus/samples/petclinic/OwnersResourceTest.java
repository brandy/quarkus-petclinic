package org.quarkus.samples.petclinic;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.quarkus.samples.petclinic.system.ErrorExceptionMapper.ERROR_HEADER;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.quarkus.samples.petclinic.owner.OwnersResource;

@QuarkusTest
@TestHTTPEndpoint(OwnersResource.class)
public class OwnersResourceTest {
}
