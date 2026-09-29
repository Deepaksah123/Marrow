package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.createForPropertyOverride;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u000f\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u000f\u0010\u000e\u001a/\u0010\u0004\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0004\u0010\u0010"}, d2 = {"Lo/Module;", "", "p0", "Lo/createForPropertyOverride;", "read", "(Lo/Module;Ljava/lang/Object;)Lo/createForPropertyOverride;", "T", "IconCompatParcelizer", "(Lo/createForPropertyOverride;)Lo/createForPropertyOverride;", "Lkotlin/Function1;", "", "p1", "", "write", "(Lo/Module;Ljava/lang/Object;Lo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "(Lo/createForPropertyOverride;Lo/getAnswerMap;)V", "Lo/createForPropertyOverride$write$IconCompatParcelizer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PropertyName {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    public static final <T extends createForPropertyOverride> T IconCompatParcelizer(T t) {
        ObjectReader objectReader;
        T t2 = t;
        int iWrite = _bind.write(262144);
        if (!t2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = t2.getRead().getMediaBrowserCompatItemReceiver();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(t2);
        while (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (mediaBrowserCompatItemReceiver != null) {
                    if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof createForPropertyOverride) {
                                T t3 = (T) iconCompatParcelizerWrite;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t.getMediaBrowserCompatCustomActionResultReceiver(), t3.getMediaBrowserCompatCustomActionResultReceiver()) && _skipComma.AudioAttributesCompatParcelizer(t, t3)) {
                                    return t3;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizer != null) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
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
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    public static final <T extends createForPropertyOverride> void RemoteActionCompatParcelizer(T t, getAnswerMap<? super T, Boolean> getanswermap) {
        ObjectReader objectReader;
        T t2 = t;
        int iWrite = _bind.write(262144);
        if (!t2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = t2.getRead().getMediaBrowserCompatItemReceiver();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(t2);
        while (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (mediaBrowserCompatItemReceiver != null) {
                    if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof createForPropertyOverride) {
                                createForPropertyOverride createforpropertyoverride = (createForPropertyOverride) iconCompatParcelizerWrite;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t.getMediaBrowserCompatCustomActionResultReceiver(), createforpropertyoverride.getMediaBrowserCompatCustomActionResultReceiver()) && _skipComma.AudioAttributesCompatParcelizer(t, createforpropertyoverride) && !getanswermap.invoke(createforpropertyoverride).booleanValue()) {
                                    return;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizer != null) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public static final <T extends createForPropertyOverride> void read(T t, getAnswerMap<? super T, ? extends createForPropertyOverride.Companion.IconCompatParcelizer> getanswermap) {
        createForPropertyOverride.Companion.IconCompatParcelizer iconCompatParcelizerInvoke;
        T t2 = t;
        int iWrite = _bind.write(262144);
        if (!t2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitSubtreeIf called on an unattached node");
        }
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = t2.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader, t2.getRead(), false);
        } else {
            uTF32Reader.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = (_handleOddName.IconCompatParcelizer) uTF32Reader.RemoteActionCompatParcelizer(uTF32Reader.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizer.getRemoteActionCompatParcelizer() & iWrite) != 0) {
                for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer2 = iconCompatParcelizer; audioAttributesImplBaseParcelizer2 != null && audioAttributesImplBaseParcelizer2.getRatingCompat(); audioAttributesImplBaseParcelizer2 = audioAttributesImplBaseParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                    if ((audioAttributesImplBaseParcelizer2.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplBaseParcelizer2;
                        UTF32Reader uTF32Reader2 = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof createForPropertyOverride) {
                                createForPropertyOverride createforpropertyoverride = (createForPropertyOverride) iconCompatParcelizerWrite;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t.getMediaBrowserCompatCustomActionResultReceiver(), createforpropertyoverride.getMediaBrowserCompatCustomActionResultReceiver()) && _skipComma.AudioAttributesCompatParcelizer(t, createforpropertyoverride)) {
                                    iconCompatParcelizerInvoke = getanswermap.invoke(createforpropertyoverride);
                                } else {
                                    iconCompatParcelizerInvoke = createForPropertyOverride.Companion.IconCompatParcelizer.read;
                                }
                                if (iconCompatParcelizerInvoke == createForPropertyOverride.Companion.IconCompatParcelizer.write) {
                                    return;
                                }
                                if (iconCompatParcelizerInvoke == createForPropertyOverride.Companion.IconCompatParcelizer.IconCompatParcelizer) {
                                    break;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizer2 != null) {
                                    if ((iconCompatParcelizer2.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer2;
                                        } else {
                                            if (uTF32Reader2 == null) {
                                                uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader2 != null) {
                                                uTF32Reader2.read(iconCompatParcelizer2);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                        }
                    }
                }
            }
            collectLongDefaults.read(uTF32Reader, iconCompatParcelizer, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    public static final createForPropertyOverride read(Module module, Object obj) {
        ObjectReader objectReader;
        int iWrite = _bind.write(262144);
        if (!module.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = module.getRead().getMediaBrowserCompatItemReceiver();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(module);
        while (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (mediaBrowserCompatItemReceiver != null) {
                    if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof createForPropertyOverride) {
                                createForPropertyOverride createforpropertyoverride = (createForPropertyOverride) iconCompatParcelizerWrite;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, createforpropertyoverride.getMediaBrowserCompatCustomActionResultReceiver())) {
                                    return createforpropertyoverride;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizer != null) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
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
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    public static final void write(Module module, Object obj, getAnswerMap<? super createForPropertyOverride, Boolean> getanswermap) {
        ObjectReader objectReader;
        int iWrite = _bind.write(262144);
        if (!module.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitAncestors called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = module.getRead().getMediaBrowserCompatItemReceiver();
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(module);
        while (_assertnotnullAudioAttributesImplApi26Parcelizer != null) {
            if ((_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (mediaBrowserCompatItemReceiver != null) {
                    if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = mediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof createForPropertyOverride) {
                                createForPropertyOverride createforpropertyoverride = (createForPropertyOverride) iconCompatParcelizerWrite;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, createforpropertyoverride.getMediaBrowserCompatCustomActionResultReceiver()) && !getanswermap.invoke(createforpropertyoverride).booleanValue()) {
                                    return;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizer != null) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    public static final void RemoteActionCompatParcelizer(Module module, Object obj, getAnswerMap<? super createForPropertyOverride, ? extends createForPropertyOverride.Companion.IconCompatParcelizer> getanswermap) {
        createForPropertyOverride.Companion.IconCompatParcelizer iconCompatParcelizerInvoke;
        int iWrite = _bind.write(262144);
        if (!module.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitSubtreeIf called on an unattached node");
        }
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = module.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader, module.getRead(), false);
        } else {
            uTF32Reader.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = (_handleOddName.IconCompatParcelizer) uTF32Reader.RemoteActionCompatParcelizer(uTF32Reader.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizer.getRemoteActionCompatParcelizer() & iWrite) != 0) {
                for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer2 = iconCompatParcelizer; audioAttributesImplBaseParcelizer2 != null && audioAttributesImplBaseParcelizer2.getRatingCompat(); audioAttributesImplBaseParcelizer2 = audioAttributesImplBaseParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                    if ((audioAttributesImplBaseParcelizer2.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplBaseParcelizer2;
                        UTF32Reader uTF32Reader2 = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof createForPropertyOverride) {
                                createForPropertyOverride createforpropertyoverride = (createForPropertyOverride) iconCompatParcelizerWrite;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, createforpropertyoverride.getMediaBrowserCompatCustomActionResultReceiver())) {
                                    iconCompatParcelizerInvoke = getanswermap.invoke(createforpropertyoverride);
                                } else {
                                    iconCompatParcelizerInvoke = createForPropertyOverride.Companion.IconCompatParcelizer.read;
                                }
                                if (iconCompatParcelizerInvoke == createForPropertyOverride.Companion.IconCompatParcelizer.write) {
                                    return;
                                }
                                if (iconCompatParcelizerInvoke == createForPropertyOverride.Companion.IconCompatParcelizer.IconCompatParcelizer) {
                                    break;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer2 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizer2 != null) {
                                    if ((iconCompatParcelizer2.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer2;
                                        } else {
                                            if (uTF32Reader2 == null) {
                                                uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader2 != null) {
                                                uTF32Reader2.read(iconCompatParcelizer2);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer2 = iconCompatParcelizer2.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                        }
                    }
                }
            }
            collectLongDefaults.read(uTF32Reader, iconCompatParcelizer, false);
        }
    }
}
