package com.weblearner.springboot;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class RandomGenerator {

	@Value("${random.int[1,10000]}")
	private int id;
	@Value("${random.long(1000000)}")
	private Long longId;
	@Value("${random.uuid}")
	private UUID uuid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getLongId() {
		return longId;
	}

	public void setLongId(Long longId) {
		this.longId = longId;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

}
