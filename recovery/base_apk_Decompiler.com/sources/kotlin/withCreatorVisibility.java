package kotlin;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0012\u001a\u00020\u0014\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u001d\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0013R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R(\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f0\u00178\u0007¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\r\u0010\u001aR\u001a\u0010\u0016\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c"}, d2 = {"Lo/withCreatorVisibility;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "", "IconCompatParcelizer", "(Ljava/lang/String;)Z", "T", "p1", "Lo/setUpdatedStatus;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/Object;)Lo/setUpdatedStatus;", "Lo/getResolutionSize;", "read", "(Ljava/lang/String;Ljava/lang/Object;)Lo/getResolutionSize;", "write", "(Ljava/lang/String;)Ljava/lang/Object;", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "AudioAttributesCompatParcelizer", "", "Ljava/util/Map;", "Lo/setOnChartValueSelectedListener$AudioAttributesCompatParcelizer;", "()Ljava/util/Map;", "Lo/setOnChartValueSelectedListener$AudioAttributesCompatParcelizer;", "()Lo/setOnChartValueSelectedListener$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withCreatorVisibility {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, Object> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, getResolutionSize<Object>> read;
    private final Map<String, getResolutionSize<Object>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Map<String, setOnChartValueSelectedListener.AudioAttributesCompatParcelizer> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setOnChartValueSelectedListener.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

    public withCreatorVisibility(Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.write = VideoTimelineResponseBody.IconCompatParcelizer(map);
        this.IconCompatParcelizer = new LinkedHashMap();
        this.read = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.AudioAttributesCompatParcelizer = new setOnChartValueSelectedListener.AudioAttributesCompatParcelizer() { // from class: o.withIsGetterVisibility
            @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
            public final Bundle read() {
                return withCreatorVisibility.IconCompatParcelizer(this.write);
            }
        };
    }

    public /* synthetic */ withCreatorVisibility(Map map, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? VideoTimelineResponseBody.read() : map);
    }

    public final Map<String, getResolutionSize<Object>> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setOnChartValueSelectedListener.AudioAttributesCompatParcelizer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle IconCompatParcelizer(withCreatorVisibility withcreatorvisibility) {
        Pair[] pairArr;
        for (Map.Entry entry : VideoTimelineResponseBody.AudioAttributesCompatParcelizer(withcreatorvisibility.RemoteActionCompatParcelizer).entrySet()) {
            withcreatorvisibility.write((String) entry.getKey(), ((getResolutionSize) entry.getValue()).IconCompatParcelizer());
        }
        for (Map.Entry entry2 : VideoTimelineResponseBody.AudioAttributesCompatParcelizer(withcreatorvisibility.IconCompatParcelizer).entrySet()) {
            withcreatorvisibility.write((String) entry2.getKey(), ((setOnChartValueSelectedListener.AudioAttributesCompatParcelizer) entry2.getValue()).read());
        }
        Map<String, Object> map = withcreatorvisibility.write;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(setAction.write(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleWrite = _getIndexResolver.write((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        setDrawOrder.AudioAttributesCompatParcelizer(bundleWrite);
        return bundleWrite;
    }

    public final boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.containsKey(p0);
    }

    public final <T> setUpdatedStatus<T> RemoteActionCompatParcelizer(String p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Map<String, getResolutionSize<Object>> map = this.read;
        getResolutionSize<Object> getresolutionsizeRemoteActionCompatParcelizer = map.get(p0);
        if (getresolutionsizeRemoteActionCompatParcelizer == null) {
            if (!this.write.containsKey(p0)) {
                this.write.put(p0, p1);
            }
            getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(this.write.get(p0));
            map.put(p0, getresolutionsizeRemoteActionCompatParcelizer);
        }
        setUpdatedStatus<T> setupdatedstatus = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.read(setupdatedstatus, "");
        return setupdatedstatus;
    }

    public final <T> getResolutionSize<T> read(String p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Map<String, getResolutionSize<Object>> map = this.RemoteActionCompatParcelizer;
        NewNumberOtpResendRequest newNumberOtpResendRequestRemoteActionCompatParcelizer = map.get(p0);
        if (newNumberOtpResendRequestRemoteActionCompatParcelizer == null) {
            if (!this.write.containsKey(p0)) {
                this.write.put(p0, p1);
            }
            newNumberOtpResendRequestRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(this.write.get(p0));
            map.put(p0, (getResolutionSize<Object>) newNumberOtpResendRequestRemoteActionCompatParcelizer);
        }
        getResolutionSize<T> getresolutionsize = (getResolutionSize) newNumberOtpResendRequestRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.read(getresolutionsize, "");
        return getresolutionsize;
    }

    public final <T> T write(String p0) {
        T t;
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            getResolutionSize<Object> getresolutionsize = this.RemoteActionCompatParcelizer.get(p0);
            return (getresolutionsize == null || (t = (T) getresolutionsize.IconCompatParcelizer()) == null) ? (T) this.write.get(p0) : t;
        } catch (ClassCastException unused) {
            this.AudioAttributesCompatParcelizer(p0);
            return null;
        }
    }

    public final <T> void write(String p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write.put(p0, p1);
        getResolutionSize<Object> getresolutionsize = this.read.get(p0);
        if (getresolutionsize != null) {
            getresolutionsize.write(p1);
        }
        getResolutionSize<Object> getresolutionsize2 = this.RemoteActionCompatParcelizer.get(p0);
        if (getresolutionsize2 != null) {
            getresolutionsize2.write(p1);
        }
    }

    private <T> T AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        T t = (T) this.write.remove(p0);
        this.read.remove(p0);
        this.RemoteActionCompatParcelizer.remove(p0);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public withCreatorVisibility() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
