package org.bs5lndt.client;

import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.Component;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.ComponentMetadata;
import fr.lteconsulting.angular2gwt.client.interop.ng.AngularComponentConstructorFunction;
import fr.lteconsulting.angular2gwt.client.JsToolsInjector;
import fr.lteconsulting.angular2gwt.client.JsObject;

public class ApplicationComponent_AngularComponent
{
    @JsProperty( namespace = "org.bs5lndt.client", name = "ApplicationComponent" )
    private native static AngularComponentConstructorFunction constructorFunction();

    public static Object getComponentPrototype()
    {
        JsToolsInjector.inject();

        AngularComponentConstructorFunction constructorFunction = constructorFunction();

        if( constructorFunction.annotations == null )
        {
            JsObject options = new JsObject();
            options.set( "selector", "my-app" );
            options.set( "template", "<h1>{{title}}</h1>You can edit the title by changing the text in this box :<br/><input [(ngModel)]='title'/>" );

            ComponentMetadata metadata = new ComponentMetadata( options );

            constructorFunction.annotations = JsArray.of( new Component( metadata ) );
        }

        return constructorFunction;
    }
}
