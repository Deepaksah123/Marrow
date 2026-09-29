package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin._findSyncTypeName;
import kotlin._handleOddName;
import kotlin.getTypeProperty;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\f\u001b#%!&$\u0019\u0013\u0012'\u000b\u000fB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\tH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0004\b\u0012\u0010\u0016J\u001b\u0010\u000f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0004\b\u000f\u0010\u0017R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\""}, d2 = {"Lo/getTypeProperty;", "", "Lkotlin/Function0;", "Lo/JavaUtilCollectionsDeserializers;", "p0", "", "p1", "<init>", "(Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "", "Lo/getTypeProperty$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Ljava/util/Collection;", "", "Lo/getTypeProperty$AudioAttributesImplBaseParcelizer;", "read", "()Ljava/util/Set;", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "write", "IconCompatParcelizer", "Lo/ObjectIdReferenceProperty;", "", "(Ljava/util/Collection;)Z", "(Ljava/util/Collection;)V", "Lo/getCreatedOnDateMs;", "RemoteActionCompatParcelizer", "Lo/getTypeProperty$MediaBrowserCompatSearchResultReceiver;", "AudioAttributesImplApi21Parcelizer", "Lo/getTypeProperty$MediaBrowserCompatSearchResultReceiver;", "Lo/getTypeProperty$read;", "Lo/getTypeProperty$read;", "Lo/getTypeProperty$AudioAttributesCompatParcelizer;", "Lo/getTypeProperty$AudioAttributesCompatParcelizer;", "AudioAttributesImplApi26Parcelizer", "Ljava/util/Set;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "MediaMetadataCompat", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTypeProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final read RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final MediaBrowserCompatSearchResultReceiver read = new MediaBrowserCompatSearchResultReceiver(new getAnswerMap() { // from class: o.InnerClassProperty
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return getTypeProperty.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, (setLayoutInflater) obj);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Set<AudioAttributesImplApi21Parcelizer<? extends Object>> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Set<AudioAttributesImplApi21Parcelizer<? extends Object>> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getCreatedOnDateMs<JavaUtilCollectionsDeserializers> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Set<AudioAttributesImplApi21Parcelizer<? extends Object>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(ObjectIdReferenceProperty objectIdReferenceProperty) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(ObjectIdReferenceProperty objectIdReferenceProperty) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getTypeProperty(getCreatedOnDateMs<? extends JavaUtilCollectionsDeserializers> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        this.write = getcreatedondatems;
        this.IconCompatParcelizer = getcreatedondatems2;
        read readVar = new read(new getAnswerMap() { // from class: o.findStdValueInstantiator
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getTypeProperty.write(this.read, (setLayoutInflater) obj);
            }
        });
        this.RemoteActionCompatParcelizer = readVar;
        this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.JDKValueInstantiatorsConstantValueInstantiator
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getTypeProperty.read(this.AudioAttributesCompatParcelizer, (setLayoutInflater) obj);
            }
        });
        Set<AudioAttributesImplApi21Parcelizer<? extends Object>> setWrite = write();
        this.AudioAttributesImplApi21Parcelizer = setWrite;
        Set<AudioAttributesImplApi21Parcelizer<? extends Object>> setRemoteActionCompatParcelizer = getKycMessage.RemoteActionCompatParcelizer(setWrite, IconCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = setRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = getKycMessage.RemoteActionCompatParcelizer(setRemoteActionCompatParcelizer, getKycMessage.read(readVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(getTypeProperty gettypeproperty, setLayoutInflater setlayoutinflater) {
        gettypeproperty.write.invoke().IconCompatParcelizer((setLayoutInflater<?>) setlayoutinflater);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getTypeProperty gettypeproperty, setLayoutInflater setlayoutinflater) {
        gettypeproperty.write.invoke().RemoteActionCompatParcelizer((setLayoutInflater<?>) setlayoutinflater);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getTypeProperty gettypeproperty, setLayoutInflater setlayoutinflater) {
        gettypeproperty.write.invoke().AudioAttributesCompatParcelizer((setLayoutInflater<?>) setlayoutinflater, gettypeproperty.IconCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    private final Collection<IconCompatParcelizer> AudioAttributesCompatParcelizer() {
        if (getDefaultTypeId.RemoteActionCompatParcelizer.read()) {
            return getKycMessage.read(new IconCompatParcelizer(new getAnswerMap() { // from class: o.JDKValueInstantiatorsArrayListInstantiator
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getTypeProperty.read(this.write, (getTypeProperty.RemoteActionCompatParcelizer) obj);
                }
            }));
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getTypeProperty gettypeproperty, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        gettypeproperty.write.invoke().read((RemoteActionCompatParcelizer<?, ?>) remoteActionCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    private final Set<AudioAttributesImplBaseParcelizer> read() {
        if (_findSingletonTypeName.RemoteActionCompatParcelizer.write()) {
            return getKycMessage.read(new AudioAttributesImplBaseParcelizer(new getAnswerMap() { // from class: o.JDKValueInstantiatorsLinkedHashMapInstantiator
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getTypeProperty.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (getTypeProperty.MediaBrowserCompatCustomActionResultReceiver) obj);
                }
            }));
        }
        return getKycMessage.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getTypeProperty gettypeproperty, MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        gettypeproperty.write.invoke().IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        return getShowPopup.INSTANCE;
    }

    private final Set<AudioAttributesImplApi21Parcelizer<? extends Object>> write() {
        return getKycMessage.RemoteActionCompatParcelizer(getKycMessage.RemoteActionCompatParcelizer(getKycMessage.RemoteActionCompatParcelizer(getKycMessage.IconCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer), AudioAttributesCompatParcelizer()), read()), hasDefaultType.AudioAttributesCompatParcelizer.write() ? getKycMessage.read(this.RemoteActionCompatParcelizer) : getKycMessage.read());
    }

    private final Collection<AudioAttributesImplApi21Parcelizer<? extends Object>> IconCompatParcelizer() {
        return MergingSettableBeanProperty.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() ? getKycMessage.IconCompatParcelizer(new write(new getAnswerMap() { // from class: o.JDKValueInstantiators
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getTypeProperty.RemoteActionCompatParcelizer(this.write, obj);
            }
        }), new MediaMetadataCompat(new getAnswerMap() { // from class: o.FieldProperty
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getTypeProperty.IconCompatParcelizer(this.IconCompatParcelizer, (setLayoutResource) obj);
            }
        }), new AudioAttributesImplApi26Parcelizer(new getAnswerMap() { // from class: o.linkTypeProperty
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getTypeProperty.write(this.AudioAttributesCompatParcelizer, (setImeOptions) obj);
            }
        })) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getTypeProperty gettypeproperty, Object obj) {
        gettypeproperty.write.invoke().read(obj);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getTypeProperty gettypeproperty, setLayoutResource setlayoutresource) {
        gettypeproperty.write.invoke().write((setLayoutResource<?, ?>) setlayoutresource);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getTypeProperty gettypeproperty, setImeOptions setimeoptions) {
        gettypeproperty.write.invoke().RemoteActionCompatParcelizer((setImeOptions<?, ?>) setimeoptions);
        return getShowPopup.INSTANCE;
    }

    public final boolean write(Collection<? extends ObjectIdReferenceProperty> p0) {
        Collection<? extends ObjectIdReferenceProperty> collection = p0;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            List<ObjectIdReferenceProperty> listAudioAttributesCompatParcelizer = _deserializeMissingToken.AudioAttributesCompatParcelizer((ObjectIdReferenceProperty) it.next(), new getAnswerMap() { // from class: o.JDKValueInstantiatorsHashMapInstantiator
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(getTypeProperty.RemoteActionCompatParcelizer((ObjectIdReferenceProperty) obj));
                }
            });
            Set<AudioAttributesImplApi21Parcelizer<? extends Object>> set = this.AudioAttributesImplApi21Parcelizer;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((AudioAttributesImplApi21Parcelizer) it2.next()).RemoteActionCompatParcelizer(listAudioAttributesCompatParcelizer)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void read(Collection<? extends ObjectIdReferenceProperty> p0) {
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            List<ObjectIdReferenceProperty> listAudioAttributesCompatParcelizer = _deserializeMissingToken.AudioAttributesCompatParcelizer((ObjectIdReferenceProperty) it.next(), new getAnswerMap() { // from class: o.FailingDeserializer
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(getTypeProperty.AudioAttributesCompatParcelizer((ObjectIdReferenceProperty) obj));
                }
            });
            Iterator<T> it2 = this.MediaBrowserCompatItemReceiver.iterator();
            while (it2.hasNext()) {
                ((AudioAttributesImplApi21Parcelizer) it2.next()).IconCompatParcelizer(listAudioAttributesCompatParcelizer);
            }
            this.read.RemoteActionCompatParcelizer().removeAll(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            this.read.RemoteActionCompatParcelizer().removeAll(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        }
        Iterator<T> it3 = this.AudioAttributesImplBaseParcelizer.iterator();
        while (it3.hasNext()) {
            ((AudioAttributesImplApi21Parcelizer) it3.next()).AudioAttributesCompatParcelizer();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016"}, d2 = {"Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "", "T", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "", "Lo/ObjectIdReferenceProperty;", "", "RemoteActionCompatParcelizer", "(Ljava/util/Collection;)Z", "read", "(Lo/ObjectIdReferenceProperty;)Z", "IconCompatParcelizer", "(Ljava/util/Collection;)V", "AudioAttributesCompatParcelizer", "()V", "Lo/getAnswerMap;", "", "Ljava/util/Set;", "()Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AudioAttributesImplApi21Parcelizer<T> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final getAnswerMap<T, getShowPopup> read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final Set<T> AudioAttributesCompatParcelizer = new LinkedHashSet();

        public void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
        }

        public abstract boolean read(ObjectIdReferenceProperty p0);

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesImplApi21Parcelizer(getAnswerMap<? super T, getShowPopup> getanswermap) {
            this.read = getanswermap;
        }

        public final boolean RemoteActionCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            Collection<? extends ObjectIdReferenceProperty> collection = p0;
            if ((collection instanceof Collection) && collection.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (read((ObjectIdReferenceProperty) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final Set<T> RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer() {
            List listHandleMediaPlayPauseIfPendingOnHandler = IntermediateLoginResponseBody.handleMediaPlayPauseIfPendingOnHandler(this.AudioAttributesCompatParcelizer);
            getAnswerMap<T, getShowPopup> getanswermap = this.read;
            Iterator<T> it = listHandleMediaPlayPauseIfPendingOnHandler.iterator();
            while (it.hasNext()) {
                getanswermap.invoke(it.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0013J-\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/getTypeProperty$MediaBrowserCompatItemReceiver;", "", "T", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "Lo/isHdPlaybackError;", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(Lo/isHdPlaybackError;Lo/getAnswerMap;)V", "", "Lo/ObjectIdReferenceProperty;", "IconCompatParcelizer", "(Ljava/util/Collection;)V", "", "read", "(Lo/ObjectIdReferenceProperty;)Z", "", "(Ljava/util/Collection;Lo/isHdPlaybackError;)Ljava/util/List;", "(Lo/ObjectIdReferenceProperty;Lo/isHdPlaybackError;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/isHdPlaybackError;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class MediaBrowserCompatItemReceiver<T> extends AudioAttributesImplApi21Parcelizer<T> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final isHdPlaybackError<T> IconCompatParcelizer;

        public MediaBrowserCompatItemReceiver(isHdPlaybackError<T> ishdplaybackerror, getAnswerMap<? super T, getShowPopup> getanswermap) {
            super(getanswermap);
            this.IconCompatParcelizer = ishdplaybackerror;
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            ArrayList arrayList = new ArrayList();
            for (T t : p0) {
                if (((ObjectIdReferenceProperty) t).getRead() != null) {
                    arrayList.add(t);
                }
            }
            RemoteActionCompatParcelizer().addAll(IntermediateLoginResponseBody.onPlayFromUri(read(arrayList, this.IconCompatParcelizer)));
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public boolean read(ObjectIdReferenceProperty p0) {
            return (p0.getRead() == null || read(p0, this.IconCompatParcelizer) == null) ? false : true;
        }

        private final <T> List<T> read(Collection<? extends ObjectIdReferenceProperty> collection, isHdPlaybackError<T> ishdplaybackerror) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                T t = read((ObjectIdReferenceProperty) it.next(), ishdplaybackerror);
                if (t != null) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }

        private final <T> T read(ObjectIdReferenceProperty objectIdReferenceProperty, isHdPlaybackError<T> ishdplaybackerror) {
            Object obj;
            Class<?> cls;
            Iterator<T> it = objectIdReferenceProperty.RemoteActionCompatParcelizer().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next != null && (cls = next.getClass()) != null) {
                    obj = MagicModuleFeedbackRequestBody.read(cls);
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, ishdplaybackerror)) {
                    obj = next;
                    break;
                }
            }
            return (T) customVideoError.IconCompatParcelizer(ishdplaybackerror, obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getTypeProperty$MediaMetadataCompat;", "Lo/getTypeProperty$MediaBrowserCompatItemReceiver;", "Lo/setLayoutResource;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaMetadataCompat extends MediaBrowserCompatItemReceiver<setLayoutResource<?, ?>> {
        public MediaMetadataCompat(getAnswerMap<? super setLayoutResource<?, ?>, getShowPopup> getanswermap) {
            super(toMagicModuleMetaDataUcModel.write(setLayoutResource.class), getanswermap);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/getTypeProperty$AudioAttributesImplApi26Parcelizer;", "Lo/getTypeProperty$MediaBrowserCompatItemReceiver;", "Lo/setImeOptions;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplApi26Parcelizer extends MediaBrowserCompatItemReceiver<setImeOptions<?, ?>> {
        public AudioAttributesImplApi26Parcelizer(getAnswerMap<? super setImeOptions<?, ?>, getShowPopup> getanswermap) {
            super(toMagicModuleMetaDataUcModel.write(setImeOptions.class), getanswermap);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/getTypeProperty$MediaBrowserCompatCustomActionResultReceiver;", "", "Lo/setSwitchPadding;", "p0", "Lo/ManagedReferenceProperty;", "", "p1", "<init>", "(Lo/setSwitchPadding;Lo/ManagedReferenceProperty;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/setSwitchPadding;", "()Lo/setSwitchPadding;", "write", "Lo/ManagedReferenceProperty;", "AudioAttributesCompatParcelizer", "()Lo/ManagedReferenceProperty;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaBrowserCompatCustomActionResultReceiver {
        public static final int AudioAttributesCompatParcelizer = setSwitchPadding.RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final setSwitchPadding write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final ManagedReferenceProperty<Long> IconCompatParcelizer;

        public MediaBrowserCompatCustomActionResultReceiver(setSwitchPadding setswitchpadding, ManagedReferenceProperty<Long> managedReferenceProperty) {
            this.write = setswitchpadding;
            this.IconCompatParcelizer = managedReferenceProperty;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final setSwitchPadding getWrite() {
            return this.write;
        }

        public final ManagedReferenceProperty<Long> AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof MediaBrowserCompatCustomActionResultReceiver)) {
                return false;
            }
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (MediaBrowserCompatCustomActionResultReceiver) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, mediaBrowserCompatCustomActionResultReceiver.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
        }

        public final int hashCode() {
            return (this.write.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaBrowserCompatCustomActionResultReceiver(write=");
            sb.append(this.write);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getTypeProperty$AudioAttributesImplBaseParcelizer;", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "Lo/getTypeProperty$MediaBrowserCompatCustomActionResultReceiver;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/ObjectIdReferenceProperty;", "", "read", "(Lo/ObjectIdReferenceProperty;)Z", "", "IconCompatParcelizer", "(Ljava/util/Collection;)V", "Lo/getIdType;", "AudioAttributesCompatParcelizer", "(Lo/ObjectIdReferenceProperty;)Lo/getIdType;", "", "write", "(Ljava/util/Collection;)Ljava/util/List;", "Lo/InputAccessor;", "Lo/parseDouble;", "", "RemoteActionCompatParcelizer", "(Lo/ObjectIdReferenceProperty;)Lo/InputAccessor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends AudioAttributesImplApi21Parcelizer<MediaBrowserCompatCustomActionResultReceiver> {
        public AudioAttributesImplBaseParcelizer(getAnswerMap<? super MediaBrowserCompatCustomActionResultReceiver, getShowPopup> getanswermap) {
            super(getanswermap);
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final boolean read(ObjectIdReferenceProperty p0) {
            Object next;
            if (AudioAttributesCompatParcelizer(p0) == null) {
                return false;
            }
            Collection<Object> collectionRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
            Collection<ObjectIdReferenceProperty> collection = p0.read();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((ObjectIdReferenceProperty) it.next()).RemoteActionCompatParcelizer());
            }
            Iterator it2 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) collectionRemoteActionCompatParcelizer, (Iterable) arrayList).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next instanceof setSwitchPadding) {
                    break;
                }
            }
            return (((setSwitchPadding) (next instanceof setSwitchPadding ? next : null)) == null || RemoteActionCompatParcelizer(p0) == null) ? false : true;
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            RemoteActionCompatParcelizer().addAll(write(p0));
        }

        private final getIdType AudioAttributesCompatParcelizer(ObjectIdReferenceProperty p0) {
            if (p0.getRead() == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getWrite(), (Object) "rememberInfiniteTransition")) {
                p0 = null;
            }
            if (p0 == null || !(p0 instanceof getIdType)) {
                return null;
            }
            return (getIdType) p0;
        }

        private final List<MediaBrowserCompatCustomActionResultReceiver> write(Collection<? extends ObjectIdReferenceProperty> p0) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
            Object next;
            ArrayList<getIdType> arrayList = new ArrayList();
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                getIdType getidtypeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((ObjectIdReferenceProperty) it.next());
                if (getidtypeAudioAttributesCompatParcelizer != null) {
                    arrayList.add(getidtypeAudioAttributesCompatParcelizer);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (getIdType getidtype : arrayList) {
                Collection<Object> collectionRemoteActionCompatParcelizer = getidtype.RemoteActionCompatParcelizer();
                Collection<ObjectIdReferenceProperty> collection = getidtype.read();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = collection.iterator();
                while (it2.hasNext()) {
                    IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList3, (Iterable) ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer());
                }
                Iterator it3 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) collectionRemoteActionCompatParcelizer, (Iterable) arrayList3).iterator();
                while (true) {
                    mediaBrowserCompatCustomActionResultReceiver = null;
                    mediaBrowserCompatCustomActionResultReceiver = null;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (next instanceof setSwitchPadding) {
                        break;
                    }
                }
                if (!(next instanceof setSwitchPadding)) {
                    next = null;
                }
                setSwitchPadding setswitchpadding = (setSwitchPadding) next;
                InputAccessor<parseDouble<Long>> inputAccessorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getidtype);
                if (setswitchpadding != null && inputAccessorRemoteActionCompatParcelizer != null) {
                    if (inputAccessorRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer() == null) {
                        inputAccessorRemoteActionCompatParcelizer.write(new ManagedReferenceProperty(0L));
                    }
                    parseDouble<Long> remoteActionCompatParcelizer = inputAccessorRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
                    ManagedReferenceProperty managedReferenceProperty = remoteActionCompatParcelizer instanceof ManagedReferenceProperty ? (ManagedReferenceProperty) remoteActionCompatParcelizer : null;
                    if (managedReferenceProperty == null) {
                        managedReferenceProperty = new ManagedReferenceProperty(0L);
                    }
                    mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(setswitchpadding, managedReferenceProperty);
                }
                if (mediaBrowserCompatCustomActionResultReceiver != null) {
                    arrayList2.add(mediaBrowserCompatCustomActionResultReceiver);
                }
            }
            return arrayList2;
        }

        private final InputAccessor<parseDouble<Long>> RemoteActionCompatParcelizer(ObjectIdReferenceProperty p0) {
            Object next;
            Collection<Object> collectionRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
            Collection<ObjectIdReferenceProperty> collection = p0.read();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((ObjectIdReferenceProperty) it.next()).read());
            }
            List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) collection, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listAudioAttributesCompatParcelizer.iterator();
            while (it2.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer());
            }
            Iterator it3 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) collectionRemoteActionCompatParcelizer, (Iterable) arrayList2).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (next instanceof InputAccessor) {
                    break;
                }
            }
            return (InputAccessor) (next instanceof InputAccessor ? next : null);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 "}, d2 = {"Lo/getTypeProperty$RemoteActionCompatParcelizer;", "T", "Lo/ScrollingTabContainerView;", "V", "", "Lo/LinearLayoutCompat;", "p0", "Lo/setOrientation;", "p1", "Lo/ManagedReferenceProperty;", "p2", "<init>", "(Lo/LinearLayoutCompat;Lo/setOrientation;Lo/ManagedReferenceProperty;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/LinearLayoutCompat;", "()Lo/LinearLayoutCompat;", "write", "Lo/setOrientation;", "RemoteActionCompatParcelizer", "()Lo/setOrientation;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/ManagedReferenceProperty;", "()Lo/ManagedReferenceProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer<T, V extends ScrollingTabContainerView> {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final ManagedReferenceProperty<T> write;
        private final LinearLayoutCompat<T, V> read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final setOrientation<T> IconCompatParcelizer;

        public RemoteActionCompatParcelizer(LinearLayoutCompat<T, V> linearLayoutCompat, setOrientation<T> setorientation, ManagedReferenceProperty<T> managedReferenceProperty) {
            this.read = linearLayoutCompat;
            this.IconCompatParcelizer = setorientation;
            this.write = managedReferenceProperty;
        }

        public final LinearLayoutCompat<T, V> read() {
            return this.read;
        }

        public final setOrientation<T> RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final ManagedReferenceProperty<T> write() {
            return this.write;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, remoteActionCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, remoteActionCompatParcelizer.write);
        }

        public final int hashCode() {
            return (((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(read=");
            sb.append(this.read);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u00020\u0013\"\u0004\b\u0000\u0010\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018\u0018\u00010\u0017\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0019J%\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001d\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u001e"}, d2 = {"Lo/getTypeProperty$IconCompatParcelizer;", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "Lo/getTypeProperty$RemoteActionCompatParcelizer;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/ObjectIdReferenceProperty;", "", "read", "(Lo/ObjectIdReferenceProperty;)Z", "", "IconCompatParcelizer", "(Ljava/util/Collection;)V", "Lo/getIdType;", "AudioAttributesCompatParcelizer", "(Lo/ObjectIdReferenceProperty;)Lo/getIdType;", "T", "", "Lo/ScrollingTabContainerView;", "write", "(Ljava/util/Collection;)Ljava/util/List;", "Lo/InputAccessor;", "Lo/parseDouble;", "(Lo/ObjectIdReferenceProperty;)Lo/InputAccessor;", "Lo/setOrientation;", "RemoteActionCompatParcelizer", "(Lo/getIdType;)Lo/setOrientation;", "Lo/LinearLayoutCompat;", "(Lo/getIdType;)Lo/LinearLayoutCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends AudioAttributesImplApi21Parcelizer<RemoteActionCompatParcelizer<?, ?>> {
        public IconCompatParcelizer(getAnswerMap<? super RemoteActionCompatParcelizer<?, ?>, getShowPopup> getanswermap) {
            super(getanswermap);
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final boolean read(ObjectIdReferenceProperty p0) {
            getIdType getidtypeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
            return (getidtypeAudioAttributesCompatParcelizer == null || IconCompatParcelizer(getidtypeAudioAttributesCompatParcelizer) == null || RemoteActionCompatParcelizer(getidtypeAudioAttributesCompatParcelizer) == null || IconCompatParcelizer((ObjectIdReferenceProperty) getidtypeAudioAttributesCompatParcelizer) == null) ? false : true;
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            RemoteActionCompatParcelizer().addAll(write(p0));
        }

        private final getIdType AudioAttributesCompatParcelizer(ObjectIdReferenceProperty p0) {
            if (p0.getRead() == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getWrite(), (Object) "animateValueAsState")) {
                p0 = null;
            }
            if (p0 == null || !(p0 instanceof getIdType)) {
                return null;
            }
            return (getIdType) p0;
        }

        private final <T> List<RemoteActionCompatParcelizer<T, ScrollingTabContainerView>> write(Collection<? extends ObjectIdReferenceProperty> p0) {
            ArrayList<getIdType> arrayList = new ArrayList();
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                getIdType getidtypeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((ObjectIdReferenceProperty) it.next());
                if (getidtypeAudioAttributesCompatParcelizer != null) {
                    arrayList.add(getidtypeAudioAttributesCompatParcelizer);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (getIdType getidtype : arrayList) {
                LinearLayoutCompat<T, ScrollingTabContainerView> linearLayoutCompatIconCompatParcelizer = IconCompatParcelizer(getidtype);
                setOrientation<T> setorientationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getidtype);
                InputAccessor<parseDouble<T>> inputAccessorIconCompatParcelizer = IconCompatParcelizer((ObjectIdReferenceProperty) getidtype);
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
                remoteActionCompatParcelizer = null;
                remoteActionCompatParcelizer = null;
                if (linearLayoutCompatIconCompatParcelizer != null && setorientationRemoteActionCompatParcelizer != null && inputAccessorIconCompatParcelizer != null) {
                    if (inputAccessorIconCompatParcelizer.getRemoteActionCompatParcelizer() == null) {
                        inputAccessorIconCompatParcelizer.write(new ManagedReferenceProperty(linearLayoutCompatIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()));
                    }
                    parseDouble<T> remoteActionCompatParcelizer2 = inputAccessorIconCompatParcelizer.getRemoteActionCompatParcelizer();
                    ManagedReferenceProperty managedReferenceProperty = remoteActionCompatParcelizer2 instanceof ManagedReferenceProperty ? (ManagedReferenceProperty) remoteActionCompatParcelizer2 : null;
                    if (managedReferenceProperty == null) {
                        managedReferenceProperty = new ManagedReferenceProperty(linearLayoutCompatIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
                    }
                    remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(linearLayoutCompatIconCompatParcelizer, setorientationRemoteActionCompatParcelizer, managedReferenceProperty);
                }
                if (remoteActionCompatParcelizer != null) {
                    arrayList2.add(remoteActionCompatParcelizer);
                }
            }
            return arrayList2;
        }

        private final <T> setOrientation<T> RemoteActionCompatParcelizer(getIdType p0) {
            Collection<ObjectIdReferenceProperty> collection = p0.read();
            ArrayList arrayList = new ArrayList();
            for (T t : collection) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((ObjectIdReferenceProperty) t).getWrite(), (Object) "rememberUpdatedState")) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList4, (Iterable) ((ObjectIdReferenceProperty) it.next()).read());
            }
            List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList3, (Iterable) arrayList4);
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it2 = listAudioAttributesCompatParcelizer.iterator();
            while (it2.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList5, (Iterable) ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer());
            }
            ArrayList arrayList6 = new ArrayList();
            for (T t2 : arrayList5) {
                if (t2 instanceof parseDouble) {
                    arrayList6.add(t2);
                }
            }
            ArrayList arrayList7 = arrayList6;
            ArrayList arrayList8 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList7, 10));
            Iterator<T> it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(((parseDouble) it3.next()).getRemoteActionCompatParcelizer());
            }
            ArrayList arrayList9 = new ArrayList();
            for (T t3 : arrayList8) {
                if (t3 instanceof setOrientation) {
                    arrayList9.add(t3);
                }
            }
            return (setOrientation) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) arrayList9);
        }

        private final <T> LinearLayoutCompat<T, ScrollingTabContainerView> IconCompatParcelizer(getIdType p0) {
            T next;
            List listRemoteActionCompatParcelizer;
            T next2;
            T next3;
            getIdType getidtype = p0;
            Iterator<T> it = getidtype.RemoteActionCompatParcelizer().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (next instanceof LinearLayoutCompat) {
                    break;
                }
            }
            if (!(next instanceof LinearLayoutCompat)) {
                next = null;
            }
            LinearLayoutCompat linearLayoutCompat = next;
            if (linearLayoutCompat == null || (listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(linearLayoutCompat)) == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list = listRemoteActionCompatParcelizer;
            Collection<ObjectIdReferenceProperty> collection = getidtype.read();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it3.next();
                    if (next3 instanceof LinearLayoutCompat) {
                        break;
                    }
                }
                if (!(next3 instanceof LinearLayoutCompat)) {
                    next3 = null;
                }
                LinearLayoutCompat linearLayoutCompat2 = next3;
                if (linearLayoutCompat2 != null) {
                    arrayList.add(linearLayoutCompat2);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = collection.iterator();
            while (it4.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyRemoteActionCompatParcelizer = _deserializeMissingToken.RemoteActionCompatParcelizer((ObjectIdReferenceProperty) it4.next(), _findSyncTypeName.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
                if (objectIdReferencePropertyRemoteActionCompatParcelizer != null) {
                    arrayList3.add(objectIdReferencePropertyRemoteActionCompatParcelizer);
                }
            }
            ArrayList arrayList4 = arrayList2;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((ObjectIdReferenceProperty) it5.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it6.next();
                    if (next2 instanceof LinearLayoutCompat) {
                        break;
                    }
                }
                if (!(next2 instanceof LinearLayoutCompat)) {
                    next2 = null;
                }
                LinearLayoutCompat linearLayoutCompat3 = next2;
                if (linearLayoutCompat3 != null) {
                    arrayList5.add(linearLayoutCompat3);
                }
            }
            return (LinearLayoutCompat) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList4, (Iterable) arrayList5)));
        }

        private final <T> InputAccessor<parseDouble<T>> IconCompatParcelizer(ObjectIdReferenceProperty p0) {
            T next;
            List listRemoteActionCompatParcelizer;
            T next2;
            T next3;
            Iterator<T> it = p0.RemoteActionCompatParcelizer().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof InputAccessor) {
                    break;
                }
            }
            if (!(next instanceof InputAccessor)) {
                next = null;
            }
            InputAccessor inputAccessor = (InputAccessor) next;
            if (inputAccessor == null || (listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(inputAccessor)) == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list = listRemoteActionCompatParcelizer;
            Collection<ObjectIdReferenceProperty> collection = p0.read();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (next3 instanceof InputAccessor) {
                        break;
                    }
                }
                if (!(next3 instanceof InputAccessor)) {
                    next3 = null;
                }
                InputAccessor inputAccessor2 = (InputAccessor) next3;
                if (inputAccessor2 != null) {
                    arrayList.add(inputAccessor2);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = collection.iterator();
            while (it4.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyRemoteActionCompatParcelizer = _deserializeMissingToken.RemoteActionCompatParcelizer((ObjectIdReferenceProperty) it4.next(), _findSyncTypeName.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
                if (objectIdReferencePropertyRemoteActionCompatParcelizer != null) {
                    arrayList3.add(objectIdReferencePropertyRemoteActionCompatParcelizer);
                }
            }
            ArrayList arrayList4 = arrayList2;
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((ObjectIdReferenceProperty) it5.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    if (next2 instanceof InputAccessor) {
                        break;
                    }
                }
                if (!(next2 instanceof InputAccessor)) {
                    next2 = null;
                }
                InputAccessor inputAccessor3 = (InputAccessor) next2;
                if (inputAccessor3 != null) {
                    arrayList5.add(inputAccessor3);
                }
            }
            return (InputAccessor) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList4, (Iterable) arrayList5)));
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getTypeProperty$write;", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/ObjectIdReferenceProperty;", "", "read", "(Lo/ObjectIdReferenceProperty;)Z", "", "IconCompatParcelizer", "(Ljava/util/Collection;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends AudioAttributesImplApi21Parcelizer<Object> {
        public write(getAnswerMap<Object, getShowPopup> getanswermap) {
            super(getanswermap);
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final boolean read(ObjectIdReferenceProperty p0) {
            if (p0.AudioAttributesCompatParcelizer().isEmpty()) {
                return false;
            }
            List<getAbsentValue> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            if ((listAudioAttributesCompatParcelizer instanceof Collection) && listAudioAttributesCompatParcelizer.isEmpty()) {
                return false;
            }
            Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                if (((getAbsentValue) it.next()).getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o._findUtilArrayTypeName
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(getTypeProperty.write.read((_handleOddName.RemoteActionCompatParcelizer) obj));
                    }
                })) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean read(_handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) remoteActionCompatParcelizer.getClass().getName(), (Object) "androidx.compose.animation.SizeAnimationModifierElement");
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : p0) {
                if (!((ObjectIdReferenceProperty) obj).AudioAttributesCompatParcelizer().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((ObjectIdReferenceProperty) it.next()).AudioAttributesCompatParcelizer().iterator();
                while (it2.hasNext()) {
                    ((getAbsentValue) it2.next()).getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o._findUnmodifiableTypeName
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(getTypeProperty.write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, (_handleOddName.RemoteActionCompatParcelizer) obj2));
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean AudioAttributesCompatParcelizer(write writeVar, _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) remoteActionCompatParcelizer.getClass().getName(), (Object) "androidx.compose.animation.SizeAnimationModifierElement")) {
                return false;
            }
            writeVar.RemoteActionCompatParcelizer().add(remoteActionCompatParcelizer);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lo/getTypeProperty$MediaBrowserCompatSearchResultReceiver;", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "Lo/setLayoutInflater;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/ObjectIdReferenceProperty;", "", "read", "(Lo/ObjectIdReferenceProperty;)Z", "", "IconCompatParcelizer", "(Ljava/util/Collection;)V", "(Lo/ObjectIdReferenceProperty;)Lo/ObjectIdReferenceProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatSearchResultReceiver extends AudioAttributesImplApi21Parcelizer<setLayoutInflater<?>> {
        public MediaBrowserCompatSearchResultReceiver(getAnswerMap<? super setLayoutInflater<?>, getShowPopup> getanswermap) {
            super(getanswermap);
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final boolean read(ObjectIdReferenceProperty p0) {
            return IconCompatParcelizer(p0) != null;
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            Object next;
            Object next2;
            Set<setLayoutInflater<?>> setRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyIconCompatParcelizer = IconCompatParcelizer((ObjectIdReferenceProperty) it.next());
                if (objectIdReferencePropertyIconCompatParcelizer != null) {
                    arrayList.add(objectIdReferencePropertyIconCompatParcelizer);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof setLayoutInflater) {
                            break;
                        }
                    }
                }
                setLayoutInflater setlayoutinflater = (setLayoutInflater) (next2 instanceof setLayoutInflater ? next2 : null);
                if (setlayoutinflater != null) {
                    arrayList3.add(setlayoutinflater);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyRemoteActionCompatParcelizer = _deserializeMissingToken.RemoteActionCompatParcelizer((ObjectIdReferenceProperty) it4.next(), _findSyncTypeName.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
                if (objectIdReferencePropertyRemoteActionCompatParcelizer != null) {
                    arrayList5.add(objectIdReferencePropertyRemoteActionCompatParcelizer);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((ObjectIdReferenceProperty) it5.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof setLayoutInflater) {
                            break;
                        }
                    }
                }
                if (!(next instanceof setLayoutInflater)) {
                    next = null;
                }
                setLayoutInflater setlayoutinflater2 = (setLayoutInflater) next;
                if (setlayoutinflater2 != null) {
                    arrayList7.add(setlayoutinflater2);
                }
            }
            setRemoteActionCompatParcelizer.addAll(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList6, (Iterable) arrayList7));
        }

        private final ObjectIdReferenceProperty IconCompatParcelizer(ObjectIdReferenceProperty p0) {
            if (p0.getRead() == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getWrite(), (Object) "updateTransition")) {
                return null;
            }
            return p0;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/getTypeProperty$AudioAttributesCompatParcelizer;", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "Lo/setLayoutInflater;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/ObjectIdReferenceProperty;", "", "read", "(Lo/ObjectIdReferenceProperty;)Z", "", "IconCompatParcelizer", "(Ljava/util/Collection;)V", "AudioAttributesCompatParcelizer", "(Lo/ObjectIdReferenceProperty;)Lo/ObjectIdReferenceProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends AudioAttributesImplApi21Parcelizer<setLayoutInflater<?>> {
        public AudioAttributesCompatParcelizer(getAnswerMap<? super setLayoutInflater<?>, getShowPopup> getanswermap) {
            super(getanswermap);
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final boolean read(ObjectIdReferenceProperty p0) {
            return AudioAttributesCompatParcelizer(p0) != null;
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            Object next;
            Object next2;
            Set<setLayoutInflater<?>> setRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((ObjectIdReferenceProperty) it.next());
                if (objectIdReferencePropertyAudioAttributesCompatParcelizer != null) {
                    arrayList.add(objectIdReferencePropertyAudioAttributesCompatParcelizer);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof setLayoutInflater) {
                            break;
                        }
                    }
                }
                setLayoutInflater setlayoutinflater = (setLayoutInflater) (next2 instanceof setLayoutInflater ? next2 : null);
                if (setlayoutinflater != null) {
                    arrayList3.add(setlayoutinflater);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyRemoteActionCompatParcelizer = _deserializeMissingToken.RemoteActionCompatParcelizer((ObjectIdReferenceProperty) it4.next(), _findSyncTypeName.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
                if (objectIdReferencePropertyRemoteActionCompatParcelizer != null) {
                    arrayList5.add(objectIdReferencePropertyRemoteActionCompatParcelizer);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((ObjectIdReferenceProperty) it5.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof setLayoutInflater) {
                            break;
                        }
                    }
                }
                if (!(next instanceof setLayoutInflater)) {
                    next = null;
                }
                setLayoutInflater setlayoutinflater2 = (setLayoutInflater) next;
                if (setlayoutinflater2 != null) {
                    arrayList7.add(setlayoutinflater2);
                }
            }
            setRemoteActionCompatParcelizer.addAll(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList6, (Iterable) arrayList7));
        }

        private final ObjectIdReferenceProperty AudioAttributesCompatParcelizer(ObjectIdReferenceProperty p0) {
            Object obj = null;
            if (p0.getRead() == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getWrite(), (Object) "AnimatedVisibility")) {
                p0 = null;
            }
            if (p0 == null) {
                return null;
            }
            Iterator<T> it = p0.read().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((ObjectIdReferenceProperty) next).getWrite(), (Object) "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (ObjectIdReferenceProperty) obj;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lo/getTypeProperty$read;", "Lo/getTypeProperty$AudioAttributesImplApi21Parcelizer;", "Lo/setLayoutInflater;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/ObjectIdReferenceProperty;", "", "read", "(Lo/ObjectIdReferenceProperty;)Z", "", "IconCompatParcelizer", "(Ljava/util/Collection;)V", "(Lo/ObjectIdReferenceProperty;)Lo/ObjectIdReferenceProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends AudioAttributesImplApi21Parcelizer<setLayoutInflater<?>> {
        public read(getAnswerMap<? super setLayoutInflater<?>, getShowPopup> getanswermap) {
            super(getanswermap);
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final boolean read(ObjectIdReferenceProperty p0) {
            return IconCompatParcelizer(p0) != null;
        }

        @Override // o.getTypeProperty.AudioAttributesImplApi21Parcelizer
        public final void IconCompatParcelizer(Collection<? extends ObjectIdReferenceProperty> p0) {
            Object next;
            Object next2;
            Set<setLayoutInflater<?>> setRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyIconCompatParcelizer = IconCompatParcelizer((ObjectIdReferenceProperty) it.next());
                if (objectIdReferencePropertyIconCompatParcelizer != null) {
                    arrayList.add(objectIdReferencePropertyIconCompatParcelizer);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((ObjectIdReferenceProperty) it2.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (next2 instanceof setLayoutInflater) {
                            break;
                        }
                    }
                }
                setLayoutInflater setlayoutinflater = (setLayoutInflater) (next2 instanceof setLayoutInflater ? next2 : null);
                if (setlayoutinflater != null) {
                    arrayList3.add(setlayoutinflater);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ObjectIdReferenceProperty objectIdReferencePropertyRemoteActionCompatParcelizer = _deserializeMissingToken.RemoteActionCompatParcelizer((ObjectIdReferenceProperty) it4.next(), _findSyncTypeName.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
                if (objectIdReferencePropertyRemoteActionCompatParcelizer != null) {
                    arrayList5.add(objectIdReferencePropertyRemoteActionCompatParcelizer);
                }
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((ObjectIdReferenceProperty) it5.next()).RemoteActionCompatParcelizer().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it6.next();
                        if (next instanceof setLayoutInflater) {
                            break;
                        }
                    }
                }
                if (!(next instanceof setLayoutInflater)) {
                    next = null;
                }
                setLayoutInflater setlayoutinflater2 = (setLayoutInflater) next;
                if (setlayoutinflater2 != null) {
                    arrayList7.add(setlayoutinflater2);
                }
            }
            setRemoteActionCompatParcelizer.addAll(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList6, (Iterable) arrayList7));
        }

        private final ObjectIdReferenceProperty IconCompatParcelizer(ObjectIdReferenceProperty p0) {
            Object obj = null;
            if (p0.getRead() == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getWrite(), (Object) "AnimatedContent")) {
                p0 = null;
            }
            if (p0 == null) {
                return null;
            }
            Iterator<T> it = p0.read().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((ObjectIdReferenceProperty) next).getWrite(), (Object) "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (ObjectIdReferenceProperty) obj;
        }
    }
}
