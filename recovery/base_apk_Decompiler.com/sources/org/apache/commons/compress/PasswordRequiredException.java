package org.apache.commons.compress;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class PasswordRequiredException extends IOException {
    private static final long serialVersionUID = 1391070005491684483L;

    public PasswordRequiredException(String str) {
        StringBuilder sb = new StringBuilder("Cannot read encrypted content from ");
        sb.append(str);
        sb.append(" without a password.");
        super(sb.toString());
    }
}
