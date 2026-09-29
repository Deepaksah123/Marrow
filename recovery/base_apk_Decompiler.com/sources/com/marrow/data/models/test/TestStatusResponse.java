package com.marrow.data.models.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/marrow/data/models/test/TestStatusResponse;", "", "", "p0", "p1", "p2", "", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/marrow/data/models/test/TestStatusResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "testId", "Ljava/lang/String;", "getTestId", "activeDeviceId", "getActiveDeviceId", "platform", "getPlatform", "testStatus", "I", "getTestStatus", "instructions", "Ljava/util/List;", "getInstructions"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TestStatusResponse {
    private final String activeDeviceId;
    private final List<String> instructions;
    private final String platform;
    private final String testId;
    private final int testStatus;

    public TestStatusResponse(@JsonProperty("_id") String str, @JsonProperty("device_id") String str2, @JsonProperty("platform") String str3, @JsonProperty("status") int i, @JsonProperty("instructions") List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.testId = str;
        this.activeDeviceId = str2;
        this.platform = str3;
        this.testStatus = i;
        this.instructions = list;
    }

    public final String getTestId() {
        return this.testId;
    }

    public final String getActiveDeviceId() {
        return this.activeDeviceId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getTestStatus() {
        return this.testStatus;
    }

    public final List<String> getInstructions() {
        return this.instructions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestStatusResponse copy$default(TestStatusResponse testStatusResponse, String str, String str2, String str3, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = testStatusResponse.testId;
        }
        if ((i2 & 2) != 0) {
            str2 = testStatusResponse.activeDeviceId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = testStatusResponse.platform;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = testStatusResponse.testStatus;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = testStatusResponse.instructions;
        }
        return testStatusResponse.copy(str, str4, str5, i3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActiveDeviceId() {
        return this.activeDeviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTestStatus() {
        return this.testStatus;
    }

    public final List<String> component5() {
        return this.instructions;
    }

    public final TestStatusResponse copy(@JsonProperty("_id") String p0, @JsonProperty("device_id") String p1, @JsonProperty("platform") String p2, @JsonProperty("status") int p3, @JsonProperty("instructions") List<String> p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new TestStatusResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TestStatusResponse)) {
            return false;
        }
        TestStatusResponse testStatusResponse = (TestStatusResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testId, (Object) testStatusResponse.testId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.activeDeviceId, (Object) testStatusResponse.activeDeviceId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.platform, (Object) testStatusResponse.platform) && this.testStatus == testStatusResponse.testStatus && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.instructions, testStatusResponse.instructions);
    }

    public final int hashCode() {
        int iHashCode = this.testId.hashCode();
        String str = this.activeDeviceId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.platform;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Integer.hashCode(this.testStatus);
        List<String> list = this.instructions;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.testId;
        String str2 = this.activeDeviceId;
        String str3 = this.platform;
        int i = this.testStatus;
        List<String> list = this.instructions;
        StringBuilder sb = new StringBuilder("TestStatusResponse(testId=");
        sb.append(str);
        sb.append(", activeDeviceId=");
        sb.append(str2);
        sb.append(", platform=");
        sb.append(str3);
        sb.append(", testStatus=");
        sb.append(i);
        sb.append(", instructions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
