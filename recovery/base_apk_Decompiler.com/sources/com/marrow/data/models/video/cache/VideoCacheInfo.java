package com.marrow.data.models.video.cache;

/* JADX INFO: loaded from: classes.dex */
public class VideoCacheInfo {
    public static final int DOWNLOAD_STATUS_DOWNLOADED = 1;
    public static final int DOWNLOAD_STATUS_DOWNLOADING = -2;
    public static final int DOWNLOAD_STATUS_NOT_DOWNLOADED = 0;
    public static final int DOWNLOAD_STATUS_QUEUED = -1;
    private int courseId;
    private float downloadPercent;
    private String downloadSessionId;
    private long downloadStartedTimeMs;
    private int downloadStatus;
    private int downloadVersion;
    private int downloadedThemeState;
    private String encryptSalt;
    private String id;
    private long lastQueuedTimeMs;
    private long lastUpdatedTimeMs;
    private int pixelRate;

    @Deprecated
    private int pytCount = 0;
    private String referenceId;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setReferenceId(String str) {
        this.referenceId = str;
    }

    public String getReferenceId() {
        return this.referenceId;
    }

    public long getDownloadStartedTimeMs() {
        return this.downloadStartedTimeMs;
    }

    public void setDownloadStartedTimeMs(long j) {
        this.downloadStartedTimeMs = j;
    }

    public String getLessonId() {
        return getReferenceId();
    }

    public int getPixelRate() {
        return this.pixelRate;
    }

    public void setPixelRate(int i) {
        this.pixelRate = i;
    }

    public long getLastUpdatedMs() {
        return this.lastUpdatedTimeMs;
    }

    public void setLastUpdatedMs(long j) {
        this.lastUpdatedTimeMs = j;
    }

    public float getDownloadPercent() {
        return this.downloadPercent;
    }

    public void setDownloadPercent(float f) {
        this.downloadPercent = f;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public long getLastQueuedTimeMs() {
        return this.lastQueuedTimeMs;
    }

    public void setLastQueuedTimeMs(long j) {
        this.lastQueuedTimeMs = j;
    }

    public void setEncryptSalt(String str) {
        this.encryptSalt = str;
    }

    public String getEncryptSalt() {
        return this.encryptSalt;
    }

    public void setDownloadVersion(int i) {
        this.downloadVersion = i;
    }

    public int getDownloadVersion() {
        return this.downloadVersion;
    }

    @Deprecated
    public int getPytCount() {
        return this.pytCount;
    }

    public void setPytCount(int i) {
        this.pytCount = i;
    }

    public String getDownloadSessionId() {
        return this.downloadSessionId;
    }

    public void setDownloadSessionId(String str) {
        this.downloadSessionId = str;
    }

    public void setDownloadedThemeState(int i) {
        this.downloadedThemeState = i;
    }

    public int getDownloadedThemeState() {
        return this.downloadedThemeState;
    }

    public void setCourseId(int i) {
        this.courseId = i;
    }

    public int getCourseId() {
        return this.courseId;
    }
}
