package com.turknet.boot.model.infrastructure;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONFIGURATION")
public class Configuration implements Serializable  { 
	private static final long serialVersionUID = -831702155937197587L;

	@Id
	@GeneratedValue
	@Column(name="CONFIGURATION_ID")
	private Long configurationId;
	
	@Column(name="CONFIG_NAME")
	private String configName;
	
	@Column(name="CONFIG_VAL")
	private String configValue;

	public Configuration(){
	}
	
	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((configurationId == null) ? 0 : configurationId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		if (configurationId == null) {
			if (other.configurationId != null)
				return false;
		} else if (!configurationId.equals(other.configurationId))
			return false;
		return true;
	} 
}
