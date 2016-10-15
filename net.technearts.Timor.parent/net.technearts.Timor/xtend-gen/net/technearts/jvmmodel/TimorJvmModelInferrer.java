/**
 * generated by Xtext 2.10.0
 */
package net.technearts.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import net.technearts.timor.File;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class TimorJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected void _infer(final File file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\nmissing \']\' at \'}\'"
      + "\nThe method or field type is undefined for the type MethodDeclaration"
      + "\nThe method or field feature is undefined"
      + "\nThe method or field feature is undefined"
      + "\nThe method or field feature is undefined"
      + "\ndocumentation cannot be resolved"
      + "\nparams cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparameterType cannot be resolved"
      + "\nbody cannot be resolved");
  }
  
  public void infer(final EObject file, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (file instanceof File) {
      _infer((File)file, acceptor, isPreIndexingPhase);
      return;
    } else if (file != null) {
      _infer(file, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(file, acceptor, isPreIndexingPhase).toString());
    }
  }
}
