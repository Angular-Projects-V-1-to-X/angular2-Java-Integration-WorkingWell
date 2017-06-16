package org.bs5lndt.client;

import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.NgModuleMetadata;
import fr.lteconsulting.angular2gwt.client.interop.ng.AngularComponentConstructorFunction;
import fr.lteconsulting.angular2gwt.client.JsToolsInjector;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.NgModule;
import fr.lteconsulting.angular2gwt.client.JsObject;

public class ApplicationModule_AngularModule
{
    @JsProperty( namespace = "ng.platformBrowser", name = "BrowserModule" )
    private native static AngularComponentConstructorFunction constructorFunctionOf_ng_platformBrowser_BrowserModule();

    @JsProperty( namespace = "ng.forms", name = "FormsModule" )
    private native static AngularComponentConstructorFunction constructorFunctionOf_ng_forms_FormsModule();

    @JsProperty( namespace = "org.bs5lndt.client", name = "ApplicationModule" )
    private native static AngularComponentConstructorFunction constructorFunction();

    public static Object getNgModulePrototype()
    {
        JsToolsInjector.inject();

        AngularComponentConstructorFunction constructorFunction = constructorFunction();

        if( constructorFunction.annotations == null )
        {
            JsObject options = new JsObject();
            options.set( "imports", JsArray.of( constructorFunctionOf_ng_platformBrowser_BrowserModule(), constructorFunctionOf_ng_forms_FormsModule() ) );
            options.set( "declarations", JsArray.of( org.bs5lndt.client.ApplicationComponent_AngularComponent.getComponentPrototype() ) );
            options.set( "bootstrap", JsArray.of( org.bs5lndt.client.ApplicationComponent_AngularComponent.getComponentPrototype() ) );

            NgModuleMetadata metadata = new NgModuleMetadata( options );

            constructorFunction.annotations = JsArray.of( new NgModule( metadata ) );
        }

        return constructorFunction;
    }
}
