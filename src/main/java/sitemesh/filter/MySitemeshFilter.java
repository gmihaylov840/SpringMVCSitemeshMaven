package sitemesh.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class MySitemeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "/decorators/decorator.html").addExcludedPath("/excluded/*")
				.addExcludedPath("/resources/*").addExcludedPath("/decorators/*");
	}
}
