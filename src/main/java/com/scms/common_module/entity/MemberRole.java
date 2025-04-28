package com.scms.common_module.entity;

public enum MemberRole {
    SUPER_ADMIN, ADMIN, EDITOR, GUEST;

    public String getAuthority() {
        return name(); // Or "ROLE_" + name()
    }
}
