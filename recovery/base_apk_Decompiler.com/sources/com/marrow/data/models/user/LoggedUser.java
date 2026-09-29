package com.marrow.data.models.user;

import com.marrow.data.api.models.response.user.UserConfig;
import java.util.Map;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class LoggedUser {
    public static String CRASHLYTICS_LOGGED_OUT_USER_ID = "";
    private int courseId;
    private int defaultCourseEdition;
    private String email;
    private boolean isYearUpdateRequired;
    private boolean mEmailVerified;
    private boolean mShowLegalPopup;
    private String refreshToken;
    private long tncConsentDate;
    private boolean tncConsentRequired;
    private String token;
    private User user;
    private UserConfig userConfig;

    public LoggedUser(User user) {
        this.user = user;
    }

    public User getInfo() {
        return this.user;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public boolean isEmailVerified() {
        return this.mEmailVerified;
    }

    public void setEmailVerified(boolean z) {
        this.mEmailVerified = z;
    }

    public void setShowLegalPopup(boolean z) {
        this.mShowLegalPopup = z;
    }

    public boolean showLegalPopup() {
        return this.mShowLegalPopup;
    }

    public boolean isSignedIn() {
        return !parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) this.token);
    }

    public boolean isFmgStudent() {
        User user = this.user;
        return (user == null || user.getCollege() == null || !parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.user.getCollege().getStateId(), "101")) ? false : true;
    }

    public boolean getTncConsentRequired() {
        return this.tncConsentRequired;
    }

    public void setTncConsentRequired(boolean z) {
        this.tncConsentRequired = z;
    }

    public long getTncConsentDate() {
        return this.tncConsentDate;
    }

    public void setTncConsentDate(long j) {
        this.tncConsentDate = j;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int i) {
        this.courseId = i;
    }

    public int getDefaultCourseEdition() {
        return this.defaultCourseEdition;
    }

    public void setDefaultCourseEdition(int i) {
        this.defaultCourseEdition = i;
    }

    public boolean isYearUpdateRequired() {
        return this.isYearUpdateRequired;
    }

    public void setYearUpdateRequired(boolean z) {
        this.isYearUpdateRequired = z;
    }

    public void setUserConfig(Map<String, UserConfig> map) {
        if (map == null || !map.containsKey(String.valueOf(this.courseId))) {
            return;
        }
        this.userConfig = map.get(String.valueOf(this.courseId));
    }

    public UserConfig getUserConfig() {
        return this.userConfig;
    }
}
