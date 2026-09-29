package com.google.android.recaptcha;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaDefinitions;", "", "<init>", "()V", "", "DEFAULT_TIMEOUT_EXECUTE", "J", "DEFAULT_TIMEOUT_INIT", "MIN_TIMEOUT_EXECUTE", "MIN_TIMEOUT_INIT"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecaptchaDefinitions {
    public static final long DEFAULT_TIMEOUT_EXECUTE = 10000;
    public static final long DEFAULT_TIMEOUT_INIT = 10000;
    public static final RecaptchaDefinitions INSTANCE = new RecaptchaDefinitions();
    public static final long MIN_TIMEOUT_EXECUTE = 5000;
    public static final long MIN_TIMEOUT_INIT = 5000;

    private RecaptchaDefinitions() {
    }
}
