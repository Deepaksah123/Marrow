package kotlin;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.getPackageInstaller;
import kotlin.getProviderInfo;
import kotlin.getReceiverInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class getUserBadgedLabel {
    private final getPackagesHoldingPermissions read;
    private static AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(0);
    private static final String RemoteActionCompatParcelizer = "SidecarAdapter";

    private /* synthetic */ getUserBadgedLabel(byte b) {
        this(getPackagesHoldingPermissions.write);
    }

    private getUserBadgedLabel(getPackagesHoldingPermissions getpackagesholdingpermissions) {
        toMagicModuleMetaRepoModel.write(getpackagesholdingpermissions, "");
        this.read = getpackagesholdingpermissions;
    }

    private List<getResourcesForActivity> write(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(sidecarDeviceState, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getResourcesForActivity getresourcesforactivityWrite = write((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (getresourcesforactivityWrite != null) {
                arrayList.add(getresourcesforactivityWrite);
            }
        }
        return arrayList;
    }

    public final getPreferredActivities RemoteActionCompatParcelizer(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        toMagicModuleMetaRepoModel.write(sidecarDeviceState, "");
        if (sidecarWindowLayoutInfo == null) {
            return new getPreferredActivities(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AudioAttributesCompatParcelizer.IconCompatParcelizer(sidecarDeviceState2, AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sidecarDeviceState));
        return new getPreferredActivities(write(AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public static boolean read(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sidecarDeviceState) != AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sidecarDeviceState2)) ? false : true;
    }

    public final boolean RemoteActionCompatParcelizer(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return write(AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sidecarWindowLayoutInfo), AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sidecarWindowLayoutInfo2));
    }

    private static boolean write(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!RemoteActionCompatParcelizer(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private getResourcesForActivity write(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        getReceiverInfo.read readVarAudioAttributesCompatParcelizer;
        getProviderInfo.read readVar;
        toMagicModuleMetaRepoModel.write(sidecarDisplayFeature, "");
        toMagicModuleMetaRepoModel.write(sidecarDeviceState, "");
        getPackageInstaller.Companion companion = getPackageInstaller.INSTANCE;
        String str = RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) getPackageInstaller.Companion.IconCompatParcelizer(sidecarDisplayFeature, str, this.read, getLeanbackLaunchIntentForPackage.INSTANCE).RemoteActionCompatParcelizer("Type must be either TYPE_FOLD or TYPE_HINGE", new getAnswerMap() { // from class: o.getXml
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getUserBadgedLabel.read((SidecarDisplayFeature) obj));
            }
        }).RemoteActionCompatParcelizer("Feature bounds must not be 0", new getAnswerMap() { // from class: o.hasSystemFeature
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getUserBadgedLabel.MediaBrowserCompatItemReceiver((SidecarDisplayFeature) obj));
            }
        }).RemoteActionCompatParcelizer("TYPE_FOLD must have 0 area", new getAnswerMap() { // from class: o.isSafeMode
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getUserBadgedLabel.MediaBrowserCompatCustomActionResultReceiver((SidecarDisplayFeature) obj));
            }
        }).RemoteActionCompatParcelizer("Feature be pinned to either left or top", new getAnswerMap() { // from class: o.getUserBadgedIcon
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getUserBadgedLabel.AudioAttributesImplApi21Parcelizer((SidecarDisplayFeature) obj));
            }
        }).AudioAttributesCompatParcelizer();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            getReceiverInfo.read.Companion companion2 = getReceiverInfo.read.INSTANCE;
            readVarAudioAttributesCompatParcelizer = getReceiverInfo.read.Companion.AudioAttributesCompatParcelizer();
        } else {
            if (type != 2) {
                return null;
            }
            getReceiverInfo.read.Companion companion3 = getReceiverInfo.read.INSTANCE;
            readVarAudioAttributesCompatParcelizer = getReceiverInfo.read.Companion.read();
        }
        int iRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sidecarDeviceState);
        if (iRemoteActionCompatParcelizer != 0 && iRemoteActionCompatParcelizer != 1) {
            if (iRemoteActionCompatParcelizer == 2) {
                readVar = getProviderInfo.read.IconCompatParcelizer;
            } else if (iRemoteActionCompatParcelizer == 3 || iRemoteActionCompatParcelizer != 4) {
                readVar = getProviderInfo.read.read;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rect, "");
            return new getReceiverInfo(new getPackageGids(rect), readVarAudioAttributesCompatParcelizer, readVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(SidecarDisplayFeature sidecarDisplayFeature) {
        toMagicModuleMetaRepoModel.write(sidecarDisplayFeature, "");
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatItemReceiver(SidecarDisplayFeature sidecarDisplayFeature) {
        toMagicModuleMetaRepoModel.write(sidecarDisplayFeature, "");
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatCustomActionResultReceiver(SidecarDisplayFeature sidecarDisplayFeature) {
        toMagicModuleMetaRepoModel.write(sidecarDisplayFeature, "");
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi21Parcelizer(SidecarDisplayFeature sidecarDisplayFeature) {
        toMagicModuleMetaRepoModel.write(sidecarDisplayFeature, "");
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static List<SidecarDisplayFeature> RemoteActionCompatParcelizer(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            toMagicModuleMetaRepoModel.write(sidecarWindowLayoutInfo, "");
            try {
                try {
                    List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    return (List) objInvoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public static int RemoteActionCompatParcelizer(SidecarDeviceState sidecarDeviceState) {
            toMagicModuleMetaRepoModel.write(sidecarDeviceState, "");
            int iIconCompatParcelizer = IconCompatParcelizer(sidecarDeviceState);
            if (iIconCompatParcelizer < 0 || iIconCompatParcelizer > 4) {
                return 0;
            }
            return iIconCompatParcelizer;
        }

        private static int IconCompatParcelizer(SidecarDeviceState sidecarDeviceState) {
            toMagicModuleMetaRepoModel.write(sidecarDeviceState, "");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    return ((Integer) objInvoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public static void IconCompatParcelizer(SidecarDeviceState sidecarDeviceState, int i) {
            toMagicModuleMetaRepoModel.write(sidecarDeviceState, "");
            try {
                sidecarDeviceState.posture = i;
            } catch (NoSuchFieldError unused) {
                try {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                } catch (IllegalAccessException unused2) {
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } catch (NoSuchMethodException unused3) {
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                } catch (InvocationTargetException unused4) {
                    getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                }
            }
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    public getUserBadgedLabel() {
        this((byte) 0);
    }
}
