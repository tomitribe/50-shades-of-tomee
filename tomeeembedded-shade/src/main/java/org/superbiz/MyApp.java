package org.superbiz;

import org.apache.openejb.testing.ApplicationComposers;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.EnableServices;

@EnableServices(jaxrs = true)
@Classes(context = "/", value = PeopleResource.class)
public class MyApp {
    public static void main(final String[] args) {
        ApplicationComposers.run(MyApp.class, args);
    }
}
