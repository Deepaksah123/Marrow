package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000e\u0007\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\f\u0010\u0011J!\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0014J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\f\u0010\u0019J\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u000e\u0010\u001bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\f\u0010\u0013J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\f\u0010\u001dJ7\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001e2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u001eH\u0002¢\u0006\u0004\b\u0015\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010 "}, d2 = {"Lo/getJsonValueAccessor;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "p0", "Lo/getJsonValueAccessor$write;", "read", "(Landroidx/fragment/app/Fragment;)Lo/getJsonValueAccessor$write;", "Lo/_anyVisible;", "p1", "", "RemoteActionCompatParcelizer", "(Lo/getJsonValueAccessor$write;Lo/_anyVisible;)V", "AudioAttributesCompatParcelizer", "(Lo/_anyVisible;)V", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "(Landroidx/fragment/app/Fragment;)V", "IconCompatParcelizer", "write", "", "p2", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "", "(Landroidx/fragment/app/Fragment;Z)V", "Ljava/lang/Runnable;", "(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V", "Ljava/lang/Class;", "(Lo/getJsonValueAccessor$write;Ljava/lang/Class;Ljava/lang/Class;)Z", "Lo/getJsonValueAccessor$write;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getJsonValueAccessor {
    public static final getJsonValueAccessor INSTANCE = new getJsonValueAccessor();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static write RemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/getJsonValueAccessor$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "read", "write", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AudioAttributesCompatParcelizer {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface read {
    }

    private getJsonValueAccessor() {
    }

    private static write read(Fragment p0) {
        while (p0 != null) {
            if (p0.isAdded()) {
                FragmentManager parentFragmentManager = p0.getParentFragmentManager();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
                if (parentFragmentManager.onPlayFromSearch() != null) {
                    write writeVarOnPlayFromSearch = parentFragmentManager.onPlayFromSearch();
                    toMagicModuleMetaRepoModel.write(writeVarOnPlayFromSearch);
                    return writeVarOnPlayFromSearch;
                }
            }
            p0 = p0.getParentFragment();
        }
        return RemoteActionCompatParcelizer;
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Fragment p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        getAnyGetterField getanygetterfield = new getAnyGetterField(p0, p1);
        AudioAttributesCompatParcelizer(getanygetterfield);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_FRAGMENT_REUSE) && IconCompatParcelizer(writeVar, p0.getClass(), getanygetterfield.getClass())) {
            RemoteActionCompatParcelizer(writeVar, getanygetterfield);
        }
    }

    @getMagicModuleMeta
    public static final void read(Fragment p0, ViewGroup p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getAnySetterMethod getanysettermethod = new getAnySetterMethod(p0, p1);
        AudioAttributesCompatParcelizer(getanysettermethod);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_FRAGMENT_TAG_USAGE) && IconCompatParcelizer(writeVar, p0.getClass(), getanysettermethod.getClass())) {
            RemoteActionCompatParcelizer(writeVar, getanysettermethod);
        }
    }

    @getMagicModuleMeta
    public static final void write(Fragment p0, Fragment p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        _applyAnnotations _applyannotations = new _applyAnnotations(p0, p1, p2);
        AudioAttributesCompatParcelizer(_applyannotations);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_WRONG_NESTED_HIERARCHY) && IconCompatParcelizer(writeVar, p0.getClass(), _applyannotations.getClass())) {
            RemoteActionCompatParcelizer(writeVar, _applyannotations);
        }
    }

    @getMagicModuleMeta
    public static final void write(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        _anyExplicitNames _anyexplicitnames = new _anyExplicitNames(p0);
        AudioAttributesCompatParcelizer(_anyexplicitnames);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_RETAIN_INSTANCE_USAGE) && IconCompatParcelizer(writeVar, p0.getClass(), _anyexplicitnames.getClass())) {
            RemoteActionCompatParcelizer(writeVar, _anyexplicitnames);
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getClassDef getclassdef = new getClassDef(p0);
        AudioAttributesCompatParcelizer(getclassdef);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_RETAIN_INSTANCE_USAGE) && IconCompatParcelizer(writeVar, p0.getClass(), getclassdef.getClass())) {
            RemoteActionCompatParcelizer(writeVar, getclassdef);
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(Fragment p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        _explode _explodeVar = new _explode(p0, p1);
        AudioAttributesCompatParcelizer(_explodeVar);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_SET_USER_VISIBLE_HINT) && IconCompatParcelizer(writeVar, p0.getClass(), _explodeVar.getClass())) {
            RemoteActionCompatParcelizer(writeVar, _explodeVar);
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Fragment p0, Fragment p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(p0, p1, p2);
        AudioAttributesCompatParcelizer(pOJOPropertyBuilder);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_TARGET_FRAGMENT_USAGE) && IconCompatParcelizer(writeVar, p0.getClass(), pOJOPropertyBuilder.getClass())) {
            RemoteActionCompatParcelizer(writeVar, pOJOPropertyBuilder);
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        _anyExplicitNamesWithoutIgnoral _anyexplicitnameswithoutignoral = new _anyExplicitNamesWithoutIgnoral(p0);
        AudioAttributesCompatParcelizer(_anyexplicitnameswithoutignoral);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_TARGET_FRAGMENT_USAGE) && IconCompatParcelizer(writeVar, p0.getClass(), _anyexplicitnameswithoutignoral.getClass())) {
            RemoteActionCompatParcelizer(writeVar, _anyexplicitnameswithoutignoral);
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(Fragment p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        reportProblem reportproblem = new reportProblem(p0);
        AudioAttributesCompatParcelizer(reportproblem);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_TARGET_FRAGMENT_USAGE) && IconCompatParcelizer(writeVar, p0.getClass(), reportproblem.getClass())) {
            RemoteActionCompatParcelizer(writeVar, reportproblem);
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Fragment p0, ViewGroup p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        _anyIgnorals _anyignorals = new _anyIgnorals(p0, p1);
        AudioAttributesCompatParcelizer(_anyignorals);
        write writeVar = read(p0);
        if (writeVar.write().contains(AudioAttributesCompatParcelizer.DETECT_WRONG_FRAGMENT_CONTAINER) && IconCompatParcelizer(writeVar, p0.getClass(), _anyignorals.getClass())) {
            RemoteActionCompatParcelizer(writeVar, _anyignorals);
        }
    }

    private static void AudioAttributesCompatParcelizer(_anyVisible p0) {
        if (FragmentManager.write(3)) {
            p0.getRemoteActionCompatParcelizer().getClass().getName();
        }
    }

    private static boolean IconCompatParcelizer(write p0, Class<? extends Fragment> p1, Class<? extends _anyVisible> p2) {
        Set<Class<? extends _anyVisible>> set = p0.RemoteActionCompatParcelizer().get(p1.getName());
        if (set == null) {
            return true;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p2.getSuperclass(), _anyVisible.class) || !IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(set, p2.getSuperclass())) {
            return !set.contains(p2);
        }
        return false;
    }

    private static void RemoteActionCompatParcelizer(final write p0, final _anyVisible p1) {
        Fragment fragmentWrite = p1.getRemoteActionCompatParcelizer();
        final String name = fragmentWrite.getClass().getName();
        if (p0.write().contains(AudioAttributesCompatParcelizer.PENALTY_LOG)) {
        }
        if (p0.getWrite() != null) {
            RemoteActionCompatParcelizer(fragmentWrite, new Runnable() { // from class: o.getPropertyMap
                @Override // java.lang.Runnable
                public final void run() {
                    getJsonValueAccessor.IconCompatParcelizer(p0, p1);
                }
            });
        }
        if (p0.write().contains(AudioAttributesCompatParcelizer.PENALTY_DEATH)) {
            RemoteActionCompatParcelizer(fragmentWrite, new Runnable() { // from class: o.getJsonKeyAccessor
                @Override // java.lang.Runnable
                public final void run() {
                    String str = name;
                    getJsonValueAccessor.RemoteActionCompatParcelizer(p1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(write writeVar, _anyVisible _anyvisible) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(_anyvisible, "");
        writeVar.getWrite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(_anyVisible _anyvisible) {
        toMagicModuleMetaRepoModel.write(_anyvisible, "");
        throw _anyvisible;
    }

    private static void RemoteActionCompatParcelizer(Fragment p0, Runnable p1) {
        if (p0.isAdded()) {
            Handler write2 = p0.getParentFragmentManager().onPlay().getWrite();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write2.getLooper(), Looper.myLooper())) {
                p1.run();
                return;
            } else {
                write2.post(p1);
                return;
            }
        }
        p1.run();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R4\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getJsonValueAccessor$write;", "", "", "Lo/getJsonValueAccessor$AudioAttributesCompatParcelizer;", "p0", "Lo/getJsonValueAccessor$read;", "p1", "", "", "", "Ljava/lang/Class;", "Lo/_anyVisible;", "p2", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "read", "Ljava/util/Set;", "write", "()Ljava/util/Set;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/getJsonValueAccessor$read;", "()Lo/getJsonValueAccessor$read;", "Ljava/util/Map;", "RemoteActionCompatParcelizer", "()Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final Map<String, Set<Class<? extends _anyVisible>>> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final read write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final Set<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
        public static final write RemoteActionCompatParcelizer = new write(getKycMessage.read(), VideoTimelineResponseBody.read());

        /* JADX WARN: Multi-variable type inference failed */
        private write(Set<? extends AudioAttributesCompatParcelizer> set, Map<String, ? extends Set<Class<? extends _anyVisible>>> map) {
            toMagicModuleMetaRepoModel.write(set, "");
            toMagicModuleMetaRepoModel.write(map, "");
            this.AudioAttributesCompatParcelizer = set;
            this.write = null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends _anyVisible>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.RemoteActionCompatParcelizer = linkedHashMap;
        }

        public final Set<AudioAttributesCompatParcelizer> write() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final read getWrite() {
            return this.write;
        }

        public final Map<String, Set<Class<? extends _anyVisible>>> RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
