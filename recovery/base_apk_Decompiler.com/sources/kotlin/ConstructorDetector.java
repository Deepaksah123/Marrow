package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/Module;", "Lkotlin/Function0;", "Lo/WritableTypeIdInclusion;", "p0", "", "read", "(Lo/Module;Lo/getCreatedOnDateMs;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConstructorDetector {
    public static /* synthetic */ Object read$default(Module module, getCreatedOnDateMs getcreatedondatems, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 1) != 0) {
            getcreatedondatems = null;
        }
        return read(module, getcreatedondatems, sampleVideos);
    }

    public static final Object read(Module module, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj;
        isAbstract isabstractAudioAttributesImplApi21Parcelizer;
        Object obj2;
        ObjectReader objectReader;
        if (!module.getRead().getRatingCompat()) {
            return getShowPopup.INSTANCE;
        }
        int iWrite = _bind.write(524288);
        if (!module.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = module.getRead().getMediaBrowserCompatItemReceiver();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(module);
        loop0: while (true) {
            obj = null;
            if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                break;
            }
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (mediaBrowserCompatItemReceiver != null) {
                    if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof getDefaultMergeable) {
                                obj = iconCompatParcelizerWrite;
                                break loop0;
                            }
                            if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                        }
                    }
                    mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                }
            }
            _assertnotnullAudioAttributesImplApi26Parcelizer = _assertnotnullAudioAttributesImplApi26Parcelizer._init_lambda4();
            mediaBrowserCompatItemReceiver = (_assertnotnullAudioAttributesImplApi26Parcelizer == null || (objectReader = _assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2()) == null) ? null : objectReader.getAudioAttributesCompatParcelizer();
        }
        getDefaultMergeable getdefaultmergeable = (getDefaultMergeable) obj;
        return (getdefaultmergeable != null && (obj2 = getdefaultmergeable.read((isabstractAudioAttributesImplApi21Parcelizer = collectLongDefaults.AudioAttributesImplApi21Parcelizer(module)), new AnonymousClass4(getcreatedondatems, isabstractAudioAttributesImplApi21Parcelizer), sampleVideos)) == getYear.IconCompatParcelizer()) ? obj2 : getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ConstructorDetector$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/WritableTypeIdInclusion;", "AudioAttributesCompatParcelizer", "()Lo/WritableTypeIdInclusion;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<WritableTypeIdInclusion> {
        final /* synthetic */ getCreatedOnDateMs<WritableTypeIdInclusion> $IconCompatParcelizer;
        final /* synthetic */ isAbstract $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final WritableTypeIdInclusion invoke() {
            WritableTypeIdInclusion writableTypeIdInclusionInvoke;
            getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems = this.$IconCompatParcelizer;
            if (getcreatedondatems != null && (writableTypeIdInclusionInvoke = getcreatedondatems.invoke()) != null) {
                return writableTypeIdInclusionInvoke;
            }
            isAbstract isabstract = this.$read;
            if (!isabstract.MediaBrowserCompatItemReceiver()) {
                isabstract = null;
            }
            if (isabstract != null) {
                return allocCharBuffer.IconCompatParcelizer(SetterlessProperty.AudioAttributesCompatParcelizer(isabstract.write()));
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, isAbstract isabstract) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
            this.$read = isabstract;
        }
    }
}
