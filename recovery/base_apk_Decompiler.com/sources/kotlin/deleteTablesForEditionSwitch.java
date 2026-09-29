package kotlin;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.getTablesWithNullPrimaryKeysRows;

/* JADX INFO: loaded from: classes4.dex */
public final class deleteTablesForEditionSwitch {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[deleteSearchTables.values().length];
            try {
                iArr[deleteSearchTables.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deleteSearchTables.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[deleteSearchTables.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public static final Type RemoteActionCompatParcelizer(deleteOfflineDownloadedFiles deleteofflinedownloadedfiles) {
        Type typeWrite;
        toMagicModuleMetaRepoModel.write(deleteofflinedownloadedfiles, "");
        return (!(deleteofflinedownloadedfiles instanceof downloadMagicModuleMeta) || (typeWrite = ((downloadMagicModuleMeta) deleteofflinedownloadedfiles).write()) == null) ? read(deleteofflinedownloadedfiles) : typeWrite;
    }

    private static /* synthetic */ Type read(deleteOfflineDownloadedFiles deleteofflinedownloadedfiles) {
        return AudioAttributesCompatParcelizer(deleteofflinedownloadedfiles, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type AudioAttributesCompatParcelizer(deleteOfflineDownloadedFiles deleteofflinedownloadedfiles, boolean z) {
        isApiBlockError isapiblockerror = deleteofflinedownloadedfiles.read();
        if (isapiblockerror instanceof deleteCourseTables) {
            return new getFontHash((deleteCourseTables) isapiblockerror);
        }
        if (isapiblockerror instanceof isHdPlaybackError) {
            isHdPlaybackError ishdplaybackerror = (isHdPlaybackError) isapiblockerror;
            Class clsWrite = z ? MagicModuleFeedbackRequestBody.write(ishdplaybackerror) : MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror);
            List<clearAllAppData> listAM_ = deleteofflinedownloadedfiles.aM_();
            if (listAM_.isEmpty()) {
                return clsWrite;
            }
            if (clsWrite.isArray()) {
                if (clsWrite.getComponentType().isPrimitive()) {
                    return clsWrite;
                }
                clearAllAppData clearallappdata = (clearAllAppData) IntermediateLoginResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((List) listAM_);
                if (clearallappdata == null) {
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: ".concat(String.valueOf(deleteofflinedownloadedfiles)));
                }
                deleteSearchTables remoteActionCompatParcelizer = clearallappdata.getRemoteActionCompatParcelizer();
                deleteOfflineDownloadedFiles iconCompatParcelizer = clearallappdata.getIconCompatParcelizer();
                int i = remoteActionCompatParcelizer == null ? -1 : IconCompatParcelizer.AudioAttributesCompatParcelizer[remoteActionCompatParcelizer.ordinal()];
                if (i == -1 || i == 1) {
                    return clsWrite;
                }
                if (i != 2 && i != 3) {
                    throw new RenewEligibleCreator();
                }
                toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
                Type type = read(iconCompatParcelizer);
                return type instanceof Class ? clsWrite : new getAns(type);
            }
            return read(clsWrite, listAM_);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: ".concat(String.valueOf(deleteofflinedownloadedfiles)));
    }

    private static final Type read(Class<?> cls, List<clearAllAppData> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<clearAllAppData> list2 = list;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(RemoteActionCompatParcelizer((clearAllAppData) it.next()));
            }
            return new deleteSkipIntroTable(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            Class<?> cls2 = declaringClass;
            List<clearAllAppData> list3 = list;
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(RemoteActionCompatParcelizer((clearAllAppData) it2.next()));
            }
            return new deleteSkipIntroTable(cls, cls2, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type type = read(declaringClass, list.subList(length, list.size()));
        List<clearAllAppData> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(RemoteActionCompatParcelizer((clearAllAppData) it3.next()));
        }
        return new deleteSkipIntroTable(cls, type, arrayList3);
    }

    private static final Type RemoteActionCompatParcelizer(clearAllAppData clearallappdata) {
        deleteSearchTables deletesearchtablesRemoteActionCompatParcelizer = clearallappdata.RemoteActionCompatParcelizer();
        if (deletesearchtablesRemoteActionCompatParcelizer == null) {
            getTablesWithNullPrimaryKeysRows.IconCompatParcelizer iconCompatParcelizer = getTablesWithNullPrimaryKeysRows.IconCompatParcelizer;
            return getTablesWithNullPrimaryKeysRows.IconCompatParcelizer.write();
        }
        deleteOfflineDownloadedFiles deleteofflinedownloadedfiles = clearallappdata.read();
        toMagicModuleMetaRepoModel.write(deleteofflinedownloadedfiles);
        int i = IconCompatParcelizer.AudioAttributesCompatParcelizer[deletesearchtablesRemoteActionCompatParcelizer.ordinal()];
        if (i == 1) {
            return new getTablesWithNullPrimaryKeysRows(null, AudioAttributesCompatParcelizer(deleteofflinedownloadedfiles, true));
        }
        if (i == 2) {
            return AudioAttributesCompatParcelizer(deleteofflinedownloadedfiles, true);
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        return new getTablesWithNullPrimaryKeysRows(AudioAttributesCompatParcelizer(deleteofflinedownloadedfiles, true), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RemoteActionCompatParcelizer(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                getTopRankers gettoprankersRemoteActionCompatParcelizer = StateResult.RemoteActionCompatParcelizer(type, read.RemoteActionCompatParcelizer);
                StringBuilder sb = new StringBuilder();
                sb.append(((Class) StateResult.MediaBrowserCompatCustomActionResultReceiver(gettoprankersRemoteActionCompatParcelizer)).getName());
                sb.append(TestGroupLSModel.read((CharSequence) ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI, StateResult.AudioAttributesCompatParcelizer(gettoprankersRemoteActionCompatParcelizer)));
                return sb.toString();
            }
            String name = cls.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
            return name;
        }
        return type.toString();
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Class<?>, Class<?>> {
        public static final read RemoteActionCompatParcelizer = new read();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> cls) {
            toMagicModuleMetaRepoModel.write(cls, "");
            return cls.getComponentType();
        }

        read() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }
    }
}
