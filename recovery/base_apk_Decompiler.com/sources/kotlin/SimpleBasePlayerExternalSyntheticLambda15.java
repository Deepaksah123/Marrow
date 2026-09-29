package kotlin;

import android.location.Location;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerExternalSyntheticLambda15 {
    private final r8lambda3EoLwxJB4A25pAog2xOLUUC2nk IconCompatParcelizer;

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[SimpleBasePlayerExternalSyntheticLambda12.values().length];
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.AudioAttributesImplApi21Parcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.AudioAttributesCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.RemoteActionCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.MediaBrowserCompatItemReceiver.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SimpleBasePlayerExternalSyntheticLambda12.AudioAttributesImplApi26Parcelizer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public SimpleBasePlayerExternalSyntheticLambda15(r8lambda3EoLwxJB4A25pAog2xOLUUC2nk r8lambda3eolwxjb4a25paog2xoluuc2nk) {
        toMagicModuleMetaRepoModel.write(r8lambda3eolwxjb4a25paog2xoluuc2nk, "");
        this.IconCompatParcelizer = r8lambda3eolwxjb4a25paog2xoluuc2nk;
    }

    public final boolean read(List<SimpleBasePlayerExternalSyntheticLambda0> list, lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, "");
        List<SimpleBasePlayerExternalSyntheticLambda0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (write((SimpleBasePlayerExternalSyntheticLambda0) it.next(), lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer)) {
                return true;
            }
        }
        return false;
    }

    private boolean write(SimpleBasePlayerExternalSyntheticLambda0 simpleBasePlayerExternalSyntheticLambda0, lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, "");
        if ((!RendererCapabilitiesListener.RemoteActionCompatParcelizer(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getAudioAttributesCompatParcelizer(), simpleBasePlayerExternalSyntheticLambda0.getAudioAttributesCompatParcelizer()) && (lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getRemoteActionCompatParcelizer() == null || !RendererCapabilitiesListener.RemoteActionCompatParcelizer(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getRemoteActionCompatParcelizer(), simpleBasePlayerExternalSyntheticLambda0.getRead()))) || !AudioAttributesCompatParcelizer(simpleBasePlayerExternalSyntheticLambda0, lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer) || !RemoteActionCompatParcelizer(simpleBasePlayerExternalSyntheticLambda0)) {
            return false;
        }
        if (!lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.RemoteActionCompatParcelizer() || RemoteActionCompatParcelizer(simpleBasePlayerExternalSyntheticLambda0, lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer)) {
            return simpleBasePlayerExternalSyntheticLambda0.RemoteActionCompatParcelizer() <= 0 || write(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, simpleBasePlayerExternalSyntheticLambda0);
        }
        return false;
    }

    private final boolean RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda0 simpleBasePlayerExternalSyntheticLambda0) {
        if (!simpleBasePlayerExternalSyntheticLambda0.getMediaBrowserCompatItemReceiver()) {
            return true;
        }
        String read = simpleBasePlayerExternalSyntheticLambda0.getRead();
        if (read == null) {
            read = simpleBasePlayerExternalSyntheticLambda0.getAudioAttributesCompatParcelizer();
        }
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(read);
    }

    private final boolean AudioAttributesCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda0 simpleBasePlayerExternalSyntheticLambda0, lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer) {
        newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, simpleBasePlayerExternalSyntheticLambda0.AudioAttributesImplBaseParcelizer());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            SimpleBasePlayerExternalSyntheticLambda1 simpleBasePlayerExternalSyntheticLambda1Write = simpleBasePlayerExternalSyntheticLambda0.write(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer());
            if (simpleBasePlayerExternalSyntheticLambda1Write != null) {
                arrayList.add(simpleBasePlayerExternalSyntheticLambda1Write);
            }
        }
        ArrayList<SimpleBasePlayerExternalSyntheticLambda1> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        for (SimpleBasePlayerExternalSyntheticLambda1 simpleBasePlayerExternalSyntheticLambda1 : arrayList2) {
            if (!AudioAttributesCompatParcelizer(simpleBasePlayerExternalSyntheticLambda1.RemoteActionCompatParcelizer(), simpleBasePlayerExternalSyntheticLambda1.IconCompatParcelizer(), lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.write(simpleBasePlayerExternalSyntheticLambda1.write()))) {
                return false;
            }
        }
        return true;
    }

    private final boolean RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda0 simpleBasePlayerExternalSyntheticLambda0, lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer) {
        newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, simpleBasePlayerExternalSyntheticLambda0.read());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            SimpleBasePlayerExternalSyntheticLambda1 simpleBasePlayerExternalSyntheticLambda1AudioAttributesCompatParcelizer = simpleBasePlayerExternalSyntheticLambda0.AudioAttributesCompatParcelizer(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer());
            if (simpleBasePlayerExternalSyntheticLambda1AudioAttributesCompatParcelizer != null) {
                arrayList.add(simpleBasePlayerExternalSyntheticLambda1AudioAttributesCompatParcelizer);
            }
        }
        ArrayList<SimpleBasePlayerExternalSyntheticLambda1> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        for (SimpleBasePlayerExternalSyntheticLambda1 simpleBasePlayerExternalSyntheticLambda1 : arrayList2) {
            List<SimpleBasePlayerExternalSyntheticLambda13> listIconCompatParcelizer = lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.IconCompatParcelizer(simpleBasePlayerExternalSyntheticLambda1.write());
            if (!listIconCompatParcelizer.isEmpty()) {
                Iterator<T> it2 = listIconCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    if (AudioAttributesCompatParcelizer(simpleBasePlayerExternalSyntheticLambda1.RemoteActionCompatParcelizer(), simpleBasePlayerExternalSyntheticLambda1.IconCompatParcelizer(), (SimpleBasePlayerExternalSyntheticLambda13) it2.next())) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    private static boolean write(lambdasetMediaItemsInternal2comgoogleandroidexoplayer2SimpleBasePlayer lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, SimpleBasePlayerExternalSyntheticLambda0 simpleBasePlayerExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda0, "");
        if (lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getRead() != null && PlayerPlaybackSuppressionReason.RemoteActionCompatParcelizer(lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getRead())) {
            int iRemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda0.RemoteActionCompatParcelizer();
            for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
                SimpleBasePlayerExternalSyntheticLambda16 simpleBasePlayerExternalSyntheticLambda16RemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda0.RemoteActionCompatParcelizer(i);
                Location location = new Location("");
                toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda16RemoteActionCompatParcelizer);
                location.setLatitude(simpleBasePlayerExternalSyntheticLambda16RemoteActionCompatParcelizer.write());
                location.setLongitude(simpleBasePlayerExternalSyntheticLambda16RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
                try {
                } catch (Exception e) {
                    lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getAudioAttributesCompatParcelizer();
                    e.getLocalizedMessage();
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                }
                if (read(simpleBasePlayerExternalSyntheticLambda16RemoteActionCompatParcelizer.read(), location, lambdasetmediaitemsinternal2comgoogleandroidexoplayer2simplebaseplayer.getRead())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean AudioAttributesCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda12 simpleBasePlayerExternalSyntheticLambda12, SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda13, SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda132) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda12, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda13, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda132, "");
        if (simpleBasePlayerExternalSyntheticLambda132.getRemoteActionCompatParcelizer() == null) {
            return simpleBasePlayerExternalSyntheticLambda12 == SimpleBasePlayerExternalSyntheticLambda12.AudioAttributesImplApi26Parcelizer;
        }
        switch (RemoteActionCompatParcelizer.IconCompatParcelizer[simpleBasePlayerExternalSyntheticLambda12.ordinal()]) {
            case 1:
                return true;
            case 2:
                return AudioAttributesCompatParcelizer(simpleBasePlayerExternalSyntheticLambda13, simpleBasePlayerExternalSyntheticLambda132, true);
            case 3:
                return AudioAttributesCompatParcelizer(simpleBasePlayerExternalSyntheticLambda13, simpleBasePlayerExternalSyntheticLambda132, false);
            case 4:
                return write(simpleBasePlayerExternalSyntheticLambda13, simpleBasePlayerExternalSyntheticLambda132);
            case 5:
                return !write(simpleBasePlayerExternalSyntheticLambda13, simpleBasePlayerExternalSyntheticLambda132);
            case 6:
                return read(simpleBasePlayerExternalSyntheticLambda13, simpleBasePlayerExternalSyntheticLambda132);
            case 7:
                return RemoteActionCompatParcelizer(simpleBasePlayerExternalSyntheticLambda13, simpleBasePlayerExternalSyntheticLambda132);
            case 8:
                return !RemoteActionCompatParcelizer(simpleBasePlayerExternalSyntheticLambda13, simpleBasePlayerExternalSyntheticLambda132);
            case 9:
                return false;
            default:
                throw new RenewEligibleCreator();
        }
    }

    private static boolean read(double d, Location location, Location location2) {
        toMagicModuleMetaRepoModel.write(location, "");
        toMagicModuleMetaRepoModel.write(location2, "");
        return RendererCapabilitiesListener.read(location, location2) <= d;
    }

    private static boolean write(SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda13, SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda132) {
        Double dRemoteActionCompatParcelizer;
        double dDoubleValue;
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda13, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda132, "");
        if (simpleBasePlayerExternalSyntheticLambda13.IconCompatParcelizer() && simpleBasePlayerExternalSyntheticLambda132.IconCompatParcelizer()) {
            List<?> listRemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda13.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer);
            HashSet hashSetOnMediaButtonEvent = IntermediateLoginResponseBody.onMediaButtonEvent(listRemoteActionCompatParcelizer);
            List<?> listRemoteActionCompatParcelizer2 = simpleBasePlayerExternalSyntheticLambda132.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer2);
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(hashSetOnMediaButtonEvent, IntermediateLoginResponseBody.onMediaButtonEvent(listRemoteActionCompatParcelizer2));
        }
        if (simpleBasePlayerExternalSyntheticLambda132.IconCompatParcelizer()) {
            List<?> listRemoteActionCompatParcelizer3 = simpleBasePlayerExternalSyntheticLambda132.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer3);
            return AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer3, simpleBasePlayerExternalSyntheticLambda13.getRemoteActionCompatParcelizer());
        }
        if (simpleBasePlayerExternalSyntheticLambda13.IconCompatParcelizer()) {
            List<?> listRemoteActionCompatParcelizer4 = simpleBasePlayerExternalSyntheticLambda13.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer4);
            return AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer4, simpleBasePlayerExternalSyntheticLambda132.getRemoteActionCompatParcelizer());
        }
        if (simpleBasePlayerExternalSyntheticLambda13.getAudioAttributesImplApi26Parcelizer() != null) {
            Number audioAttributesImplApi26Parcelizer = simpleBasePlayerExternalSyntheticLambda132.getAudioAttributesImplApi26Parcelizer();
            if (audioAttributesImplApi26Parcelizer == null) {
                String read = simpleBasePlayerExternalSyntheticLambda132.getRead();
                Double dRemoteActionCompatParcelizer2 = read != null ? TestGroupLSModel.RemoteActionCompatParcelizer(read) : null;
                if (dRemoteActionCompatParcelizer2 != null) {
                    dDoubleValue = dRemoteActionCompatParcelizer2.doubleValue();
                }
            }
            dDoubleValue = audioAttributesImplApi26Parcelizer.doubleValue();
            Number audioAttributesImplApi26Parcelizer2 = simpleBasePlayerExternalSyntheticLambda13.getAudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer2);
            return audioAttributesImplApi26Parcelizer2.doubleValue() == dDoubleValue;
        }
        if (simpleBasePlayerExternalSyntheticLambda132.getAudioAttributesImplApi26Parcelizer() != null) {
            String read2 = simpleBasePlayerExternalSyntheticLambda13.getRead();
            if (read2 != null && (dRemoteActionCompatParcelizer = TestGroupLSModel.RemoteActionCompatParcelizer(read2)) != null) {
                double dDoubleValue2 = dRemoteActionCompatParcelizer.doubleValue();
                Number audioAttributesImplApi26Parcelizer3 = simpleBasePlayerExternalSyntheticLambda132.getAudioAttributesImplApi26Parcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer3);
                if (audioAttributesImplApi26Parcelizer3.doubleValue() == dDoubleValue2) {
                    return true;
                }
            }
            return false;
        }
        if (simpleBasePlayerExternalSyntheticLambda132.getIconCompatParcelizer() != null) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) simpleBasePlayerExternalSyntheticLambda13.getRead(), (Object) simpleBasePlayerExternalSyntheticLambda132.getRead());
        }
        return false;
    }

    private static boolean AudioAttributesCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda13, SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda132, boolean z) {
        double dDoubleValue;
        double dDoubleValue2;
        Object objMediaBrowserCompatSearchResultReceiver;
        Double dValueOf;
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda13, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda132, "");
        Number audioAttributesImplApi26Parcelizer = simpleBasePlayerExternalSyntheticLambda132.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer == null) {
            String iconCompatParcelizer = simpleBasePlayerExternalSyntheticLambda132.getIconCompatParcelizer();
            Double dRemoteActionCompatParcelizer = iconCompatParcelizer != null ? TestGroupLSModel.RemoteActionCompatParcelizer(iconCompatParcelizer) : null;
            if (dRemoteActionCompatParcelizer != null) {
                dDoubleValue = dRemoteActionCompatParcelizer.doubleValue();
            }
        }
        dDoubleValue = audioAttributesImplApi26Parcelizer.doubleValue();
        List<?> listWrite = simpleBasePlayerExternalSyntheticLambda13.write();
        if (listWrite != null && (objMediaBrowserCompatSearchResultReceiver = IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List<? extends Object>) listWrite)) != null) {
            if (objMediaBrowserCompatSearchResultReceiver instanceof String) {
                dValueOf = TestGroupLSModel.RemoteActionCompatParcelizer((String) objMediaBrowserCompatSearchResultReceiver);
            } else {
                dValueOf = objMediaBrowserCompatSearchResultReceiver instanceof Number ? Double.valueOf(((Number) objMediaBrowserCompatSearchResultReceiver).doubleValue()) : null;
            }
            if (dValueOf != null) {
                double dDoubleValue3 = dValueOf.doubleValue();
                return z ? dDoubleValue < dDoubleValue3 : dDoubleValue > dDoubleValue3;
            }
        }
        Number audioAttributesImplApi26Parcelizer2 = simpleBasePlayerExternalSyntheticLambda13.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer2 == null) {
            String iconCompatParcelizer2 = simpleBasePlayerExternalSyntheticLambda13.getIconCompatParcelizer();
            Double dRemoteActionCompatParcelizer2 = iconCompatParcelizer2 != null ? TestGroupLSModel.RemoteActionCompatParcelizer(iconCompatParcelizer2) : null;
            if (dRemoteActionCompatParcelizer2 != null) {
                dDoubleValue2 = dRemoteActionCompatParcelizer2.doubleValue();
            }
        }
        dDoubleValue2 = audioAttributesImplApi26Parcelizer2.doubleValue();
        return z ? dDoubleValue < dDoubleValue2 : dDoubleValue > dDoubleValue2;
    }

    private static boolean RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda13, SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda132) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda13, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda132, "");
        if (simpleBasePlayerExternalSyntheticLambda132.getIconCompatParcelizer() != null && simpleBasePlayerExternalSyntheticLambda13.getIconCompatParcelizer() != null) {
            String read = simpleBasePlayerExternalSyntheticLambda132.getRead();
            toMagicModuleMetaRepoModel.write((Object) read);
            String read2 = simpleBasePlayerExternalSyntheticLambda13.getRead();
            toMagicModuleMetaRepoModel.write((Object) read2);
            return TestGroupLSModel.write((CharSequence) read, (CharSequence) read2, false);
        }
        if (!simpleBasePlayerExternalSyntheticLambda13.IconCompatParcelizer() || simpleBasePlayerExternalSyntheticLambda132.getIconCompatParcelizer() == null) {
            if (simpleBasePlayerExternalSyntheticLambda13.IconCompatParcelizer() && simpleBasePlayerExternalSyntheticLambda132.IconCompatParcelizer()) {
                List<?> listRemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda132.RemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listRemoteActionCompatParcelizer) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                Set setOnPlayFromUri = IntermediateLoginResponseBody.onPlayFromUri(arrayList);
                List<?> listRemoteActionCompatParcelizer2 = simpleBasePlayerExternalSyntheticLambda13.RemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listRemoteActionCompatParcelizer2) {
                    if (obj2 instanceof String) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (arrayList3.isEmpty()) {
                    return false;
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (setOnPlayFromUri.contains((String) it.next())) {
                        return true;
                    }
                }
                return false;
            }
            if (!simpleBasePlayerExternalSyntheticLambda132.IconCompatParcelizer() || simpleBasePlayerExternalSyntheticLambda13.getIconCompatParcelizer() == null) {
                return false;
            }
            List<?> listRemoteActionCompatParcelizer3 = simpleBasePlayerExternalSyntheticLambda132.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer3);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : listRemoteActionCompatParcelizer3) {
                if (obj3 instanceof String) {
                    arrayList4.add(obj3);
                }
            }
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.onPlayFromUri(arrayList4), simpleBasePlayerExternalSyntheticLambda13.getRead());
        }
        List<?> listRemoteActionCompatParcelizer4 = simpleBasePlayerExternalSyntheticLambda13.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.write(listRemoteActionCompatParcelizer4);
        getTopRankers gettoprankersIconCompatParcelizer = StateResult.IconCompatParcelizer(StateResult.AudioAttributesImplApi26Parcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) listRemoteActionCompatParcelizer4)), (getAnswerMap) AnonymousClass4.RemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.read(gettoprankersIconCompatParcelizer, "");
        Iterator itWrite = gettoprankersIconCompatParcelizer.write();
        while (itWrite.hasNext()) {
            String str = (String) itWrite.next();
            String read3 = simpleBasePlayerExternalSyntheticLambda132.getRead();
            toMagicModuleMetaRepoModel.write((Object) read3);
            if (TestGroupLSModel.write((CharSequence) read3, (CharSequence) str, false)) {
                return true;
            }
        }
        return false;
    }

    private static boolean read(SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda13, SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda132) {
        List listWrite;
        double dDoubleValue;
        Double dValueOf;
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda13, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda132, "");
        List<?> listWrite2 = simpleBasePlayerExternalSyntheticLambda13.write();
        if (listWrite2 != null) {
            if (listWrite2.size() < 2) {
                listWrite2 = null;
            }
            if (listWrite2 != null && (listWrite = IntermediateLoginResponseBody.write((Iterable) listWrite2, 2)) != null) {
                List list = listWrite;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                for (Object obj : list) {
                    if (obj instanceof String) {
                        dValueOf = TestGroupLSModel.RemoteActionCompatParcelizer((String) obj);
                    } else {
                        dValueOf = obj instanceof Number ? Double.valueOf(((Number) obj).doubleValue()) : null;
                    }
                    arrayList.add(dValueOf);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2.contains(null)) {
                    return false;
                }
                Number audioAttributesImplApi26Parcelizer = simpleBasePlayerExternalSyntheticLambda132.getAudioAttributesImplApi26Parcelizer();
                if (audioAttributesImplApi26Parcelizer != null) {
                    dDoubleValue = audioAttributesImplApi26Parcelizer.doubleValue();
                } else {
                    String iconCompatParcelizer = simpleBasePlayerExternalSyntheticLambda132.getIconCompatParcelizer();
                    Double dRemoteActionCompatParcelizer = iconCompatParcelizer != null ? TestGroupLSModel.RemoteActionCompatParcelizer(iconCompatParcelizer) : null;
                    if (dRemoteActionCompatParcelizer != null) {
                        dDoubleValue = dRemoteActionCompatParcelizer.doubleValue();
                    }
                }
                Object obj2 = arrayList2.get(0);
                toMagicModuleMetaRepoModel.write(obj2);
                double dDoubleValue2 = ((Number) obj2).doubleValue();
                Object obj3 = arrayList2.get(1);
                toMagicModuleMetaRepoModel.write(obj3);
                if (dDoubleValue <= ((Number) obj3).doubleValue() && dDoubleValue2 <= dDoubleValue) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean AudioAttributesCompatParcelizer(List<?> list, Object obj) {
        if (obj instanceof String) {
            List<?> list2 = list;
            getTopRankers gettoprankersIconCompatParcelizer = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) list2), (getAnswerMap) AnonymousClass2.RemoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.read(gettoprankersIconCompatParcelizer, "");
            Iterator itWrite = gettoprankersIconCompatParcelizer.write();
            while (true) {
                if (itWrite.hasNext()) {
                    String str = (String) itWrite.next();
                    String lowerCase = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) obj).toString().toLowerCase(Locale.ROOT);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) lowerCase)) {
                        break;
                    }
                } else {
                    getTopRankers gettoprankersIconCompatParcelizer2 = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) list2), (getAnswerMap) AnonymousClass3.read);
                    toMagicModuleMetaRepoModel.read(gettoprankersIconCompatParcelizer2, "");
                    Iterator itWrite2 = gettoprankersIconCompatParcelizer2.write();
                    while (itWrite2.hasNext()) {
                        double dDoubleValue = ((Number) itWrite2.next()).doubleValue();
                        String lowerCase2 = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) obj).toString().toLowerCase(Locale.ROOT);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
                        if (toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dDoubleValue, TestGroupLSModel.RemoteActionCompatParcelizer(lowerCase2))) {
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Number) {
            double dDoubleValue2 = ((Number) obj).doubleValue();
            List<?> list3 = list;
            getTopRankers gettoprankersIconCompatParcelizer3 = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) list3), (getAnswerMap) AnonymousClass1.read);
            toMagicModuleMetaRepoModel.read(gettoprankersIconCompatParcelizer3, "");
            Iterator itWrite3 = gettoprankersIconCompatParcelizer3.write();
            while (true) {
                if (!itWrite3.hasNext()) {
                    getTopRankers gettoprankersIconCompatParcelizer4 = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) list3), (getAnswerMap) AnonymousClass5.IconCompatParcelizer);
                    toMagicModuleMetaRepoModel.read(gettoprankersIconCompatParcelizer4, "");
                    Iterator itWrite4 = gettoprankersIconCompatParcelizer4.write();
                    while (itWrite4.hasNext()) {
                        String lowerCase3 = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) itWrite4.next()).toString().toLowerCase(Locale.ROOT);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase3, "");
                        if (toMagicModuleMetaRepoModel.read(TestGroupLSModel.RemoteActionCompatParcelizer(lowerCase3), dDoubleValue2)) {
                        }
                    }
                    return false;
                }
                if (((Number) itWrite3.next()).doubleValue() == dDoubleValue2) {
                    break;
                }
            }
            return true;
        }
        if (obj instanceof Boolean) {
            getTopRankers gettoprankersIconCompatParcelizer5 = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) list), (getAnswerMap) AnonymousClass8.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.read(gettoprankersIconCompatParcelizer5, "");
            Iterator itWrite5 = gettoprankersIconCompatParcelizer5.write();
            while (itWrite5.hasNext()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(itWrite5.next(), (Object) String.valueOf(((Boolean) obj).booleanValue()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda15$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AnonymousClass1 read = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Number);
        }

        public AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda15$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "p0", "", "write", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AnonymousClass2 RemoteActionCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof String);
        }

        public AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda15$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AnonymousClass3 read = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Number);
        }

        public AnonymousClass3() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda15$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "p0", "", "read", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AnonymousClass4 RemoteActionCompatParcelizer = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof String);
        }

        public AnonymousClass4() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda15$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "p0", "", "write", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AnonymousClass5 IconCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof String);
        }

        public AnonymousClass5() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.SimpleBasePlayerExternalSyntheticLambda15$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getAnswerMap<Object, Boolean> {
        public static final AnonymousClass8 IconCompatParcelizer = new AnonymousClass8();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof String);
        }

        public AnonymousClass8() {
            super(1);
        }
    }
}
