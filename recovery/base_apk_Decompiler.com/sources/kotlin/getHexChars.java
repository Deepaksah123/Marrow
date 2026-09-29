package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.containedTypeCount;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lo/_handleSpillOverflow;", "Lo/_checkNeedForRehash;", "p0", "Lkotlin/Function1;", "Lo/containedTypeCount$AudioAttributesCompatParcelizer;", "p1", "RemoteActionCompatParcelizer", "(Lo/_handleSpillOverflow;ILo/getAnswerMap;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getHexChars {
    public static final <T> T RemoteActionCompatParcelizer(_handleSpillOverflow _handlespilloverflow, int i, getAnswerMap<? super containedTypeCount.AudioAttributesCompatParcelizer, ? extends T> getanswermap) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite;
        containedTypeCount containedtypecountWrite;
        int iRemoteActionCompatParcelizer;
        ObjectReader objectReader;
        _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = _handlespilloverflow2.getRead().getMediaBrowserCompatItemReceiver();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow2);
        loop0: while (true) {
            if (_assertnotnullAudioAttributesImplApi26Parcelizer == null) {
                iconCompatParcelizerWrite = null;
                break;
            }
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (mediaBrowserCompatItemReceiver != null) {
                    if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                break loop0;
                            }
                            if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i2 = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        _handleSpillOverflow _handlespilloverflow3 = (_handleSpillOverflow) iconCompatParcelizerWrite;
        if ((_handlespilloverflow3 != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handlespilloverflow3.write(), _handlespilloverflow.write())) || (containedtypecountWrite = _handlespilloverflow.write()) == null) {
            return null;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            iRemoteActionCompatParcelizer = containedTypeCount.IconCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer();
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            iRemoteActionCompatParcelizer = containedTypeCount.IconCompatParcelizer.INSTANCE.write();
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read())) {
            iRemoteActionCompatParcelizer = containedTypeCount.IconCompatParcelizer.INSTANCE.IconCompatParcelizer();
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            iRemoteActionCompatParcelizer = containedTypeCount.IconCompatParcelizer.INSTANCE.AudioAttributesImplApi26Parcelizer();
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.write())) {
            iRemoteActionCompatParcelizer = containedTypeCount.IconCompatParcelizer.INSTANCE.read();
        } else {
            if (!_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iRemoteActionCompatParcelizer = containedTypeCount.IconCompatParcelizer.INSTANCE.RemoteActionCompatParcelizer();
        }
        return (T) containedtypecountWrite.write(iRemoteActionCompatParcelizer, getanswermap);
    }
}
