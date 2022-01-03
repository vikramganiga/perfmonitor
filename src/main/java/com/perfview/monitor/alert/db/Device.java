package com.perfview.monitor.alert.db;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "device")
public class Device {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "org.hibernate.type.UUIDCharType")
	@Column(length = 36, columnDefinition = "varchar(36)", nullable = false)
	UUID deviceID;
	
	String devicename;
	String details;

	public Device(String devicename, String details, Status status) {
		super();
		this.devicename = devicename;
		this.details = details;
	}

	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp createdDate;

	@Enumerated(EnumType.STRING)
	Status status;
	
	@UpdateTimestamp
	private Timestamp lastModifiedDate;

}
