package org.quarkus.samples.petclinic.system;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import io.quarkus.runtime.StartupEvent;

import org.quarkus.samples.petclinic.model.User;

@Singleton
public class Startup {
    @Transactional
    public void loadUsers(@Observes StartupEvent evt) {
        // seed User for demo
        User.deleteAll();
        User.add("user@example.com", "changeme", "users");
        User.add("user2@example.com", "changeme", "users");
    }
}