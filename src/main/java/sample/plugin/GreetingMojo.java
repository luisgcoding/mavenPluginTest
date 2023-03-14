package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Says "Hi" to the user in the console.
 *
 */
@Mojo( name = "sayhi")
public class GreetingMojo extends AbstractMojo
{
  public void execute() throws MojoExecutionException
  {
    getLog().info( "Hello, world." );
  }
}
