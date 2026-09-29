package kotlin;

import kotlin.Metadata;
import kotlin.WritableTypeIdInclusion;
import kotlin.assignParameter;
import kotlin.calloc;
import kotlin.getKey;
import kotlin.getReferencedType;
import kotlin.hasParameter;
import kotlin.hasReferringProperties;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\"!\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u0006*\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\" \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0006*\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0019\"!\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u0006*\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u001c\"!\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0006*\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010 \"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\u0006*\u00020\"8G¢\u0006\u0006\u001a\u0004\b\f\u0010$\"!\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001f0\u0006*\u00020&8G¢\u0006\u0006\u001a\u0004\b\f\u0010(\"!\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f0\u0006*\u00020*8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010,\"!\u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u0006*\u00020.8G¢\u0006\u0006\u001a\u0004\b\u000e\u00100\" \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014\" \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\" \u00104\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0014\" \u00105\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001f0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0014\" \u00106\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\" \u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\" \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0014"}, d2 = {"T", "Lo/ScrollingTabContainerView;", "V", "Lkotlin/Function1;", "p0", "p1", "Lo/evictionCount;", "write", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/evictionCount;", "Lkotlin/Float$Companion;", "", "Lo/setHoverListener;", "RemoteActionCompatParcelizer", "(Lo/MagicModuleRepositoryImplExternalSyntheticLambda1;)Lo/evictionCount;", "IconCompatParcelizer", "Lkotlin/Int$Companion;", "", "read", "(Lo/MagicModuleRepositoryImplExternalSyntheticLambda2;)Lo/evictionCount;", "AudioAttributesCompatParcelizer", "Lo/evictionCount;", "AudioAttributesImplApi21Parcelizer", "Lo/WritableTypeIdInclusion$RemoteActionCompatParcelizer;", "Lo/WritableTypeIdInclusion;", "Lo/setAppSearchData;", "(Lo/WritableTypeIdInclusion$RemoteActionCompatParcelizer;)Lo/evictionCount;", "Lo/assignParameter$IconCompatParcelizer;", "Lo/assignParameter;", "(Lo/assignParameter$IconCompatParcelizer;)Lo/evictionCount;", "Lo/hasParameter$AudioAttributesCompatParcelizer;", "Lo/hasParameter;", "Lo/MenuPopupWindowMenuDropDownListView;", "(Lo/hasParameter$AudioAttributesCompatParcelizer;)Lo/evictionCount;", "MediaBrowserCompatItemReceiver", "Lo/calloc$AudioAttributesCompatParcelizer;", "Lo/calloc;", "(Lo/calloc$AudioAttributesCompatParcelizer;)Lo/evictionCount;", "AudioAttributesImplBaseParcelizer", "Lo/getReferencedType$RemoteActionCompatParcelizer;", "Lo/getReferencedType;", "(Lo/getReferencedType$RemoteActionCompatParcelizer;)Lo/evictionCount;", "AudioAttributesImplApi26Parcelizer", "Lo/hasReferringProperties$AudioAttributesCompatParcelizer;", "Lo/hasReferringProperties;", "(Lo/hasReferringProperties$AudioAttributesCompatParcelizer;)Lo/evictionCount;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getKey$AudioAttributesCompatParcelizer;", "Lo/getKey;", "(Lo/getKey$AudioAttributesCompatParcelizer;)Lo/evictionCount;", "RatingCompat", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "onCommand"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hitCount {
    private static final evictionCount<Float, setHoverListener> read = write(new getAnswerMap() { // from class: o.get
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.IconCompatParcelizer(((Float) obj).floatValue());
        }
    }, new getAnswerMap() { // from class: o.toString
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return Float.valueOf(hitCount.AudioAttributesCompatParcelizer((setHoverListener) obj));
        }
    });
    private static final evictionCount<Integer, setHoverListener> AudioAttributesImplApi21Parcelizer = write(new getAnswerMap() { // from class: o.maxSize
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.read(((Integer) obj).intValue());
        }
    }, new getAnswerMap() { // from class: o.snapshot
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return Integer.valueOf(hitCount.AudioAttributesImplBaseParcelizer((setHoverListener) obj));
        }
    });
    private static final evictionCount<assignParameter, setHoverListener> RemoteActionCompatParcelizer = write(new getAnswerMap() { // from class: o.sizeOf
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.read((assignParameter) obj);
        }
    }, new getAnswerMap() { // from class: o.RippleContainer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.IconCompatParcelizer((setHoverListener) obj);
        }
    });
    private static final evictionCount<hasParameter, MenuPopupWindowMenuDropDownListView> AudioAttributesCompatParcelizer = write(new getAnswerMap() { // from class: o.values
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.IconCompatParcelizer((hasParameter) obj);
        }
    }, new getAnswerMap() { // from class: o.RippleHostView
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.MediaBrowserCompatCustomActionResultReceiver((MenuPopupWindowMenuDropDownListView) obj);
        }
    });
    private static final evictionCount<calloc, MenuPopupWindowMenuDropDownListView> AudioAttributesImplApi26Parcelizer = write(new getAnswerMap() { // from class: o.setRipplePropertiesbiQXAtU
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.write((calloc) obj);
        }
    }, new getAnswerMap() { // from class: o.DefaultLazyKey
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.AudioAttributesImplApi26Parcelizer((MenuPopupWindowMenuDropDownListView) obj);
        }
    });
    private static final evictionCount<getReferencedType, MenuPopupWindowMenuDropDownListView> MediaBrowserCompatItemReceiver = write(new getAnswerMap() { // from class: o.SnapshotStateList
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.AudioAttributesCompatParcelizer((getReferencedType) obj);
        }
    }, new getAnswerMap() { // from class: o.missCount
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.MediaBrowserCompatItemReceiver((MenuPopupWindowMenuDropDownListView) obj);
        }
    });
    private static final evictionCount<hasReferringProperties, MenuPopupWindowMenuDropDownListView> write = write(new getAnswerMap() { // from class: o.putCount
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.IconCompatParcelizer((hasReferringProperties) obj);
        }
    }, new getAnswerMap() { // from class: o.put
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.AudioAttributesImplApi21Parcelizer((MenuPopupWindowMenuDropDownListView) obj);
        }
    });
    private static final evictionCount<getKey, MenuPopupWindowMenuDropDownListView> IconCompatParcelizer = write(new getAnswerMap() { // from class: o.size
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.write((getKey) obj);
        }
    }, new getAnswerMap() { // from class: o.resize
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.AudioAttributesImplBaseParcelizer((MenuPopupWindowMenuDropDownListView) obj);
        }
    });
    private static final evictionCount<WritableTypeIdInclusion, setAppSearchData> MediaBrowserCompatCustomActionResultReceiver = write(new getAnswerMap() { // from class: o.valueOf
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.read((WritableTypeIdInclusion) obj);
        }
    }, new getAnswerMap() { // from class: o.trimToSize
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hitCount.write((setAppSearchData) obj);
        }
    });

    public static final <T, V extends ScrollingTabContainerView> evictionCount<T, V> write(getAnswerMap<? super T, ? extends V> getanswermap, getAnswerMap<? super V, ? extends T> getanswermap2) {
        return new evictAll(getanswermap, getanswermap2);
    }

    public static final evictionCount<Float, setHoverListener> RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1 magicModuleRepositoryImplExternalSyntheticLambda1) {
        return read;
    }

    public static final evictionCount<Integer, setHoverListener> read(MagicModuleRepositoryImplExternalSyntheticLambda2 magicModuleRepositoryImplExternalSyntheticLambda2) {
        return AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesCompatParcelizer(setHoverListener sethoverlistener) {
        return sethoverlistener.getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setHoverListener IconCompatParcelizer(float f) {
        return new setHoverListener(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplBaseParcelizer(setHoverListener sethoverlistener) {
        return (int) sethoverlistener.getIconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setHoverListener read(int i) {
        return new setHoverListener(i);
    }

    public static final evictionCount<WritableTypeIdInclusion, setAppSearchData> IconCompatParcelizer(WritableTypeIdInclusion.Companion companion) {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    public static final evictionCount<assignParameter, setHoverListener> write(assignParameter.Companion companion) {
        return RemoteActionCompatParcelizer;
    }

    public static final evictionCount<hasParameter, MenuPopupWindowMenuDropDownListView> AudioAttributesCompatParcelizer(hasParameter.Companion companion) {
        return AudioAttributesCompatParcelizer;
    }

    public static final evictionCount<calloc, MenuPopupWindowMenuDropDownListView> RemoteActionCompatParcelizer(calloc.Companion companion) {
        return AudioAttributesImplApi26Parcelizer;
    }

    public static final evictionCount<getReferencedType, MenuPopupWindowMenuDropDownListView> RemoteActionCompatParcelizer(getReferencedType.Companion companion) {
        return MediaBrowserCompatItemReceiver;
    }

    public static final evictionCount<hasReferringProperties, MenuPopupWindowMenuDropDownListView> read(hasReferringProperties.Companion companion) {
        return write;
    }

    public static final evictionCount<getKey, MenuPopupWindowMenuDropDownListView> IconCompatParcelizer(getKey.Companion companion) {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setHoverListener read(assignParameter assignparameter) {
        return new setHoverListener(assignparameter.getRemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final assignParameter IconCompatParcelizer(setHoverListener sethoverlistener) {
        return assignParameter.read(assignParameter.IconCompatParcelizer(sethoverlistener.getIconCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuPopupWindowMenuDropDownListView IconCompatParcelizer(hasParameter hasparameter) {
        return new MenuPopupWindowMenuDropDownListView(hasParameter.RemoteActionCompatParcelizer(hasparameter.getAudioAttributesCompatParcelizer()), hasParameter.read(hasparameter.getAudioAttributesCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasParameter MediaBrowserCompatCustomActionResultReceiver(MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView) {
        long j = -1;
        return hasParameter.AudioAttributesCompatParcelizer(hasParameter.write((((long) Float.floatToRawIntBits(assignParameter.IconCompatParcelizer(menuPopupWindowMenuDropDownListView.getAudioAttributesCompatParcelizer()))) << 32) | (((long) Float.floatToRawIntBits(assignParameter.IconCompatParcelizer(menuPopupWindowMenuDropDownListView.getWrite()))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuPopupWindowMenuDropDownListView write(calloc callocVar) {
        return new MenuPopupWindowMenuDropDownListView(Float.intBitsToFloat((int) (callocVar.getIconCompatParcelizer() >> 32)), Float.intBitsToFloat((int) callocVar.getIconCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final calloc AudioAttributesImplApi26Parcelizer(MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView) {
        long j = -1;
        return calloc.read(calloc.write((((long) Float.floatToRawIntBits(menuPopupWindowMenuDropDownListView.getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(menuPopupWindowMenuDropDownListView.getWrite())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuPopupWindowMenuDropDownListView AudioAttributesCompatParcelizer(getReferencedType getreferencedtype) {
        return new MenuPopupWindowMenuDropDownListView(Float.intBitsToFloat((int) (getreferencedtype.getWrite() >> 32)), Float.intBitsToFloat((int) getreferencedtype.getWrite()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getReferencedType MediaBrowserCompatItemReceiver(MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView) {
        long j = -1;
        return getReferencedType.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(menuPopupWindowMenuDropDownListView.getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(menuPopupWindowMenuDropDownListView.getWrite())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuPopupWindowMenuDropDownListView IconCompatParcelizer(hasReferringProperties hasreferringproperties) {
        return new MenuPopupWindowMenuDropDownListView(hasReferringProperties.IconCompatParcelizer(hasreferringproperties.getWrite()), hasReferringProperties.AudioAttributesCompatParcelizer(hasreferringproperties.getWrite()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasReferringProperties AudioAttributesImplApi21Parcelizer(MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView) {
        long j = -1;
        return hasReferringProperties.write(hasReferringProperties.read((((long) Math.round(menuPopupWindowMenuDropDownListView.getAudioAttributesCompatParcelizer())) << 32) | (((long) Math.round(menuPopupWindowMenuDropDownListView.getWrite())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MenuPopupWindowMenuDropDownListView write(getKey getkey) {
        return new MenuPopupWindowMenuDropDownListView((int) (getkey.getRemoteActionCompatParcelizer() >> 32), (int) getkey.getRemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getKey AudioAttributesImplBaseParcelizer(MenuPopupWindowMenuDropDownListView menuPopupWindowMenuDropDownListView) {
        int iRound = Math.round(menuPopupWindowMenuDropDownListView.getAudioAttributesCompatParcelizer());
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round(menuPopupWindowMenuDropDownListView.getWrite());
        if (iRound2 < 0) {
            iRound2 = 0;
        }
        long j = -1;
        return getKey.AudioAttributesCompatParcelizer(getKey.read((((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) iRound2)) | (iRound << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setAppSearchData read(WritableTypeIdInclusion writableTypeIdInclusion) {
        return new setAppSearchData(writableTypeIdInclusion.getAudioAttributesCompatParcelizer(), writableTypeIdInclusion.getRemoteActionCompatParcelizer(), writableTypeIdInclusion.getWrite(), writableTypeIdInclusion.getIconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion write(setAppSearchData setappsearchdata) {
        return new WritableTypeIdInclusion(setappsearchdata.getWrite(), setappsearchdata.getRemoteActionCompatParcelizer(), setappsearchdata.getRead(), setappsearchdata.getAudioAttributesCompatParcelizer());
    }
}
