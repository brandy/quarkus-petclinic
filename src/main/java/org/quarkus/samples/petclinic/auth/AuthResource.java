package org.quarkus.samples.petclinic.auth;

import org.quarkus.samples.petclinic.system.TemplatesLocale;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/auth")
public class AuthResource {

    @Inject
    TemplatesLocale templates;

    @GET
    @Path("/login")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance showResourcesAuthLoginPage() {
        return templates.authLogin();
    }
}
