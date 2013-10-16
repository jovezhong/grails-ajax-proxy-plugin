grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()
		mavenLocal()
		mavenCentral()

		mavenRepo "https://repository.jboss.org/nexus/content/repositories/thirdparty-releases"
	}

	dependencies {
		runtime('commons-httpclient:commons-httpclient:3.1') {
			transitive = false
		}
		runtime('commons-logging:commons-logging:1.1.1') {
			transitive = false
		}
		compile 'org.apache.commons:not-yet-commons-ssl:0.3.7'
	}

	plugins {
		build(':release:1.0.0') {
			export = false
		}
	}
}
