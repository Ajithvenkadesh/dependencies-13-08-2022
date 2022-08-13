package com.system.exception;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    /**
     * Starts the bundle.
     *
     * @param context The execution context of the bundle being started.
     */
    public void start(BundleContext context) {
        System.out.println("Starting the bundle");
    }

    /**
     * Stops the bundle.
     *
     * @param context The execution context of the bundle being stopped.
     */
    public void stop(BundleContext context) {
        System.out.println("Stopping the bundle");
    }

}