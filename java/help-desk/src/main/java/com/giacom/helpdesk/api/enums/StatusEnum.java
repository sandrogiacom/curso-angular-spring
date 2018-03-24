package com.giacom.helpdesk.api.enums;

public enum StatusEnum {

	NEW, ASSIGNED, RESOLVED, APROVED, DISAPROVED, CLOSED;

	public static StatusEnum getStatus(String status) {
		switch (status) {
		case "NEW":
			return NEW;
		case "ASSIGNED":
			return ASSIGNED;
		case "RESOLVED":
			return RESOLVED;
		case "APROVED":
			return APROVED;
		case "DISAPROVED":
			return DISAPROVED;
		case "CLOSED":
			return CLOSED;
		default:
			return null;
		}
	}

}
