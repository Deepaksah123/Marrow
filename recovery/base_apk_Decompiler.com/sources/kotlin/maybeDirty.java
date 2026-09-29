package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_reportTooManyCollisions;", "", "IconCompatParcelizer", "(Lo/_reportTooManyCollisions;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class maybeDirty {
    public static final void IconCompatParcelizer(_reportTooManyCollisions _reporttoomanycollisions) {
        _reportTooManyCollisions _reporttoomanycollisions2 = _reporttoomanycollisions;
        int iWrite = _bind.write(1024);
        if (!_reporttoomanycollisions2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitChildren called on an unattached node");
        }
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = _reporttoomanycollisions2.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader, _reporttoomanycollisions2.getRead(), false);
        } else {
            uTF32Reader.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = (_handleOddName.IconCompatParcelizer) uTF32Reader.RemoteActionCompatParcelizer(uTF32Reader.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizerWrite.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                collectLongDefaults.read(uTF32Reader, iconCompatParcelizerWrite, false);
            } else {
                while (true) {
                    if (iconCompatParcelizerWrite == null) {
                        break;
                    }
                    if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0) {
                        UTF32Reader uTF32Reader2 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                _thresholdSize.AudioAttributesCompatParcelizer((_handleSpillOverflow) iconCompatParcelizerWrite);
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader2 == null) {
                                                uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader2 != null) {
                                                uTF32Reader2.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                        }
                    } else {
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite.getAudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
    }
}
