package org.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperty {

	Properties prop = null;
	InputStream inputStream = null;
	public ConfigProperty() {
		try {
			inputStream = new FileInputStream("setupProperty.properties");
		prop = new Properties();
			prop.load(inputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}

	public String getBaseUrl() {
		return prop.getProperty("url");
	}

	public String getUserName() {
		return prop.getProperty("userName");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}

	public long getWaitTime() {
	return Long.valueOf(prop.getProperty("waitTime"));
		
	}

	public String getOperatingSystem() {
		return prop.getProperty("operatingSystem");

	}

}
