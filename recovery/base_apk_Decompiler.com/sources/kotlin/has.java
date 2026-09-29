package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.containedTypeCount;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a;\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a!\u0010\b\u001a\u00020\u0011*\u00020\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\b\u0010\u0012\u001a+\u0010\n\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0013\u001a/\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0015\u001a/\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0015\u001a\u0013\u0010\f\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0013\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0018"}, d2 = {"Lo/_handleSpillOverflow;", "Lo/_checkNeedForRehash;", "p0", "Lo/WritableTypeIdInclusion;", "p1", "Lkotlin/Function1;", "", "p2", "RemoteActionCompatParcelizer", "(Lo/_handleSpillOverflow;ILo/WritableTypeIdInclusion;Lo/getAnswerMap;)Ljava/lang/Boolean;", "write", "(Lo/_handleSpillOverflow;ILo/getAnswerMap;)Z", "read", "(Lo/_handleSpillOverflow;Lo/WritableTypeIdInclusion;ILo/getAnswerMap;)Z", "AudioAttributesCompatParcelizer", "Lo/Module;", "Lo/UTF32Reader;", "", "(Lo/Module;Lo/UTF32Reader;)V", "(Lo/UTF32Reader;Lo/WritableTypeIdInclusion;I)Lo/_handleSpillOverflow;", "p3", "(Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;I)Z", "(Lo/WritableTypeIdInclusion;)Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "(Lo/_handleSpillOverflow;)Lo/_handleSpillOverflow;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class has {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[_addSymbol.values().length];
            try {
                iArr[_addSymbol.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_addSymbol.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_addSymbol.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[_addSymbol.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final Boolean RemoteActionCompatParcelizer(_handleSpillOverflow _handlespilloverflow, int i, WritableTypeIdInclusion writableTypeIdInclusion, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        int i2 = WhenMappings.IconCompatParcelizer[_handlespilloverflow.AudioAttributesCompatParcelizer().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(write(_handlespilloverflow, i, getanswermap));
            }
            if (i2 != 4) {
                throw new RenewEligibleCreator();
            }
            if (_handlespilloverflow.read().getIconCompatParcelizer()) {
                return getanswermap.invoke(_handlespilloverflow);
            }
            if (writableTypeIdInclusion == null) {
                return Boolean.valueOf(write(_handlespilloverflow, i, getanswermap));
            }
            return Boolean.valueOf(AudioAttributesCompatParcelizer(_handlespilloverflow, writableTypeIdInclusion, i, getanswermap));
        }
        _handleSpillOverflow _handlespilloverflowRemoteActionCompatParcelizer = _hashToIndex.RemoteActionCompatParcelizer(_handlespilloverflow);
        if (_handlespilloverflowRemoteActionCompatParcelizer == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i3 = WhenMappings.IconCompatParcelizer[_handlespilloverflowRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().ordinal()];
        if (i3 == 1) {
            Boolean boolRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_handlespilloverflowRemoteActionCompatParcelizer, i, writableTypeIdInclusion, getanswermap);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(boolRemoteActionCompatParcelizer, Boolean.FALSE)) {
                return boolRemoteActionCompatParcelizer;
            }
            if (writableTypeIdInclusion == null) {
                writableTypeIdInclusion = _hashToIndex.write(AudioAttributesCompatParcelizer(_handlespilloverflowRemoteActionCompatParcelizer));
            }
            return Boolean.valueOf(read(_handlespilloverflow, writableTypeIdInclusion, i, getanswermap));
        }
        if (i3 == 2 || i3 == 3) {
            if (writableTypeIdInclusion == null) {
                writableTypeIdInclusion = _hashToIndex.write(_handlespilloverflowRemoteActionCompatParcelizer);
            }
            return Boolean.valueOf(read(_handlespilloverflow, writableTypeIdInclusion, i, getanswermap));
        }
        if (i3 != 4) {
            throw new RenewEligibleCreator();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    private static final boolean read(_handleSpillOverflow _handlespilloverflow, WritableTypeIdInclusion writableTypeIdInclusion, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        if (AudioAttributesCompatParcelizer(_handlespilloverflow, writableTypeIdInclusion, i, getanswermap)) {
            return true;
        }
        Boolean bool = (Boolean) getHexChars.RemoteActionCompatParcelizer(_handlespilloverflow, i, new AnonymousClass1(collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_handlespilloverflow).getOnPlayFromSearch().read(), _handlespilloverflow, writableTypeIdInclusion, i, getanswermap));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: o.has$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/containedTypeCount$AudioAttributesCompatParcelizer;", "", "read", "(Lo/containedTypeCount$AudioAttributesCompatParcelizer;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<containedTypeCount.AudioAttributesCompatParcelizer, Boolean> {
        final /* synthetic */ WritableTypeIdInclusion $AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<_handleSpillOverflow, Boolean> $IconCompatParcelizer;
        final /* synthetic */ _handleSpillOverflow $RemoteActionCompatParcelizer;
        final /* synthetic */ _handleSpillOverflow $read;
        final /* synthetic */ int $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(containedTypeCount.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            if (this.$RemoteActionCompatParcelizer == collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this.$read).getOnPlayFromSearch().read()) {
                Boolean boolValueOf = Boolean.valueOf(has.AudioAttributesCompatParcelizer(this.$read, this.$AudioAttributesCompatParcelizer, this.$write, this.$IconCompatParcelizer));
                if (boolValueOf.booleanValue() || !audioAttributesCompatParcelizer.getIconCompatParcelizer()) {
                    return boolValueOf;
                }
                return null;
            }
            return Boolean.TRUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(_handleSpillOverflow _handlespilloverflow, _handleSpillOverflow _handlespilloverflow2, WritableTypeIdInclusion writableTypeIdInclusion, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
            super(1);
            this.$RemoteActionCompatParcelizer = _handlespilloverflow;
            this.$read = _handlespilloverflow2;
            this.$AudioAttributesCompatParcelizer = writableTypeIdInclusion;
            this.$write = i;
            this.$IconCompatParcelizer = getanswermap;
        }
    }

    private static final _handleSpillOverflow write(UTF32Reader<_handleSpillOverflow> uTF32Reader, WritableTypeIdInclusion writableTypeIdInclusion, int i) {
        WritableTypeIdInclusion writableTypeIdInclusionWrite;
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read())) {
            writableTypeIdInclusionWrite = writableTypeIdInclusion.write((writableTypeIdInclusion.getWrite() - writableTypeIdInclusion.getAudioAttributesCompatParcelizer()) + 1.0f, BitmapDescriptorFactory.HUE_RED);
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            writableTypeIdInclusionWrite = writableTypeIdInclusion.write(-((writableTypeIdInclusion.getWrite() - writableTypeIdInclusion.getAudioAttributesCompatParcelizer()) + 1.0f), BitmapDescriptorFactory.HUE_RED);
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            writableTypeIdInclusionWrite = writableTypeIdInclusion.write(BitmapDescriptorFactory.HUE_RED, (writableTypeIdInclusion.getIconCompatParcelizer() - writableTypeIdInclusion.getRemoteActionCompatParcelizer()) + 1.0f);
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            writableTypeIdInclusionWrite = writableTypeIdInclusion.write(BitmapDescriptorFactory.HUE_RED, -((writableTypeIdInclusion.getIconCompatParcelizer() - writableTypeIdInclusion.getRemoteActionCompatParcelizer()) + 1.0f));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        _handleSpillOverflow[] _handlespilloverflowArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        _handleSpillOverflow _handlespilloverflow = null;
        for (int i2 = 0; i2 < audioAttributesCompatParcelizer; i2++) {
            _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflowArr[i2];
            if (_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow2)) {
                WritableTypeIdInclusion writableTypeIdInclusionWrite2 = _hashToIndex.write(_handlespilloverflow2);
                if (RemoteActionCompatParcelizer(writableTypeIdInclusionWrite2, writableTypeIdInclusionWrite, writableTypeIdInclusion, i)) {
                    _handlespilloverflow = _handlespilloverflow2;
                    writableTypeIdInclusionWrite = writableTypeIdInclusionWrite2;
                }
            }
        }
        return _handlespilloverflow;
    }

    private static final boolean read(WritableTypeIdInclusion writableTypeIdInclusion, int i, WritableTypeIdInclusion writableTypeIdInclusion2) {
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read())) {
            return (writableTypeIdInclusion2.getWrite() > writableTypeIdInclusion.getWrite() || writableTypeIdInclusion2.getAudioAttributesCompatParcelizer() >= writableTypeIdInclusion.getWrite()) && writableTypeIdInclusion2.getAudioAttributesCompatParcelizer() > writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            return (writableTypeIdInclusion2.getAudioAttributesCompatParcelizer() < writableTypeIdInclusion.getAudioAttributesCompatParcelizer() || writableTypeIdInclusion2.getWrite() <= writableTypeIdInclusion.getAudioAttributesCompatParcelizer()) && writableTypeIdInclusion2.getWrite() < writableTypeIdInclusion.getWrite();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            return (writableTypeIdInclusion2.getIconCompatParcelizer() > writableTypeIdInclusion.getIconCompatParcelizer() || writableTypeIdInclusion2.getRemoteActionCompatParcelizer() >= writableTypeIdInclusion.getIconCompatParcelizer()) && writableTypeIdInclusion2.getRemoteActionCompatParcelizer() > writableTypeIdInclusion.getRemoteActionCompatParcelizer();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            return (writableTypeIdInclusion2.getRemoteActionCompatParcelizer() < writableTypeIdInclusion.getRemoteActionCompatParcelizer() || writableTypeIdInclusion2.getIconCompatParcelizer() <= writableTypeIdInclusion.getRemoteActionCompatParcelizer()) && writableTypeIdInclusion2.getIconCompatParcelizer() < writableTypeIdInclusion.getIconCompatParcelizer();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float AudioAttributesImplApi26Parcelizer(kotlin.WritableTypeIdInclusion r1, int r2, kotlin.WritableTypeIdInclusion r3) {
        /*
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.read()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L15
            float r2 = r3.getAudioAttributesCompatParcelizer()
            float r1 = r1.getWrite()
            goto L3e
        L15:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.MediaBrowserCompatItemReceiver()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L2a
            float r1 = r1.getAudioAttributesCompatParcelizer()
            float r2 = r3.getWrite()
            goto L54
        L2a:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.AudioAttributesImplApi21Parcelizer()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L40
            float r2 = r3.getRemoteActionCompatParcelizer()
            float r1 = r1.getIconCompatParcelizer()
        L3e:
            float r2 = r2 - r1
            goto L56
        L40:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.IconCompatParcelizer()
            boolean r2 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r2 == 0) goto L5d
            float r1 = r1.getRemoteActionCompatParcelizer()
            float r2 = r3.getIconCompatParcelizer()
        L54:
            float r2 = r1 - r2
        L56:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L5c
            return r1
        L5c:
            return r2
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.has.AudioAttributesImplApi26Parcelizer(o.WritableTypeIdInclusion, int, o.WritableTypeIdInclusion):float");
    }

    private static final float MediaBrowserCompatCustomActionResultReceiver(WritableTypeIdInclusion writableTypeIdInclusion, int i, WritableTypeIdInclusion writableTypeIdInclusion2) {
        float remoteActionCompatParcelizer;
        float remoteActionCompatParcelizer2;
        float iconCompatParcelizer;
        float remoteActionCompatParcelizer3;
        if (!_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read()) && !_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            if (!_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer()) && !_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            remoteActionCompatParcelizer = writableTypeIdInclusion2.getAudioAttributesCompatParcelizer() + ((writableTypeIdInclusion2.getWrite() - writableTypeIdInclusion2.getAudioAttributesCompatParcelizer()) / 2.0f);
            remoteActionCompatParcelizer2 = writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
            iconCompatParcelizer = writableTypeIdInclusion.getWrite();
            remoteActionCompatParcelizer3 = writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        } else {
            remoteActionCompatParcelizer = writableTypeIdInclusion2.getRemoteActionCompatParcelizer() + ((writableTypeIdInclusion2.getIconCompatParcelizer() - writableTypeIdInclusion2.getRemoteActionCompatParcelizer()) / 2.0f);
            remoteActionCompatParcelizer2 = writableTypeIdInclusion.getRemoteActionCompatParcelizer();
            iconCompatParcelizer = writableTypeIdInclusion.getIconCompatParcelizer();
            remoteActionCompatParcelizer3 = writableTypeIdInclusion.getRemoteActionCompatParcelizer();
        }
        return remoteActionCompatParcelizer - (remoteActionCompatParcelizer2 + ((iconCompatParcelizer - remoteActionCompatParcelizer3) / 2.0f));
    }

    private static final long IconCompatParcelizer(int i, WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2) {
        long jAudioAttributesImplApi26Parcelizer = (long) AudioAttributesImplApi26Parcelizer(writableTypeIdInclusion2, i, writableTypeIdInclusion);
        long jMediaBrowserCompatCustomActionResultReceiver = (long) MediaBrowserCompatCustomActionResultReceiver(writableTypeIdInclusion2, i, writableTypeIdInclusion);
        return (13 * jAudioAttributesImplApi26Parcelizer * jAudioAttributesImplApi26Parcelizer) + (jMediaBrowserCompatCustomActionResultReceiver * jMediaBrowserCompatCustomActionResultReceiver);
    }

    public static final boolean RemoteActionCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2, WritableTypeIdInclusion writableTypeIdInclusion3, int i) {
        if (!read(writableTypeIdInclusion, i, writableTypeIdInclusion3)) {
            return false;
        }
        if (read(writableTypeIdInclusion2, i, writableTypeIdInclusion3) && !write(writableTypeIdInclusion3, writableTypeIdInclusion, writableTypeIdInclusion2, i)) {
            return !write(writableTypeIdInclusion3, writableTypeIdInclusion2, writableTypeIdInclusion, i) && IconCompatParcelizer(i, writableTypeIdInclusion3, writableTypeIdInclusion) < IconCompatParcelizer(i, writableTypeIdInclusion3, writableTypeIdInclusion2);
        }
        return true;
    }

    private static final boolean write(WritableTypeIdInclusion writableTypeIdInclusion, int i, WritableTypeIdInclusion writableTypeIdInclusion2) {
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            return writableTypeIdInclusion.getIconCompatParcelizer() > writableTypeIdInclusion2.getRemoteActionCompatParcelizer() && writableTypeIdInclusion.getRemoteActionCompatParcelizer() < writableTypeIdInclusion2.getIconCompatParcelizer();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            return writableTypeIdInclusion.getWrite() > writableTypeIdInclusion2.getAudioAttributesCompatParcelizer() && writableTypeIdInclusion.getAudioAttributesCompatParcelizer() < writableTypeIdInclusion2.getWrite();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
    }

    private static final boolean RemoteActionCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, int i, WritableTypeIdInclusion writableTypeIdInclusion2) {
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read())) {
            return writableTypeIdInclusion2.getAudioAttributesCompatParcelizer() >= writableTypeIdInclusion.getWrite();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver())) {
            return writableTypeIdInclusion2.getWrite() <= writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            return writableTypeIdInclusion2.getRemoteActionCompatParcelizer() >= writableTypeIdInclusion.getIconCompatParcelizer();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            return writableTypeIdInclusion2.getIconCompatParcelizer() <= writableTypeIdInclusion.getRemoteActionCompatParcelizer();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float IconCompatParcelizer(kotlin.WritableTypeIdInclusion r1, int r2, kotlin.WritableTypeIdInclusion r3) {
        /*
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.read()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L15
            float r2 = r3.getAudioAttributesCompatParcelizer()
            float r1 = r1.getWrite()
            goto L3e
        L15:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.MediaBrowserCompatItemReceiver()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L2a
            float r1 = r1.getAudioAttributesCompatParcelizer()
            float r2 = r3.getWrite()
            goto L54
        L2a:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.AudioAttributesImplApi21Parcelizer()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L40
            float r2 = r3.getRemoteActionCompatParcelizer()
            float r1 = r1.getIconCompatParcelizer()
        L3e:
            float r2 = r2 - r1
            goto L56
        L40:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.IconCompatParcelizer()
            boolean r2 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r2 == 0) goto L5d
            float r1 = r1.getRemoteActionCompatParcelizer()
            float r2 = r3.getIconCompatParcelizer()
        L54:
            float r2 = r1 - r2
        L56:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L5c
            return r1
        L5c:
            return r2
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.has.IconCompatParcelizer(o.WritableTypeIdInclusion, int, o.WritableTypeIdInclusion):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float AudioAttributesCompatParcelizer(kotlin.WritableTypeIdInclusion r1, int r2, kotlin.WritableTypeIdInclusion r3) {
        /*
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.read()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L15
            float r2 = r3.getAudioAttributesCompatParcelizer()
            float r1 = r1.getAudioAttributesCompatParcelizer()
            goto L3e
        L15:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.MediaBrowserCompatItemReceiver()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L2a
            float r1 = r1.getWrite()
            float r2 = r3.getWrite()
            goto L54
        L2a:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.AudioAttributesImplApi21Parcelizer()
            boolean r0 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L40
            float r2 = r3.getRemoteActionCompatParcelizer()
            float r1 = r1.getRemoteActionCompatParcelizer()
        L3e:
            float r2 = r2 - r1
            goto L56
        L40:
            o._checkNeedForRehash$AudioAttributesCompatParcelizer r0 = kotlin._checkNeedForRehash.INSTANCE
            int r0 = r0.IconCompatParcelizer()
            boolean r2 = kotlin._checkNeedForRehash.IconCompatParcelizer(r2, r0)
            if (r2 == 0) goto L5e
            float r1 = r1.getIconCompatParcelizer()
            float r2 = r3.getIconCompatParcelizer()
        L54:
            float r2 = r1 - r2
        L56:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L5d
            return r1
        L5d:
            return r2
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.has.AudioAttributesCompatParcelizer(o.WritableTypeIdInclusion, int, o.WritableTypeIdInclusion):float");
    }

    private static final boolean write(WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2, WritableTypeIdInclusion writableTypeIdInclusion3, int i) {
        if (write(writableTypeIdInclusion3, i, writableTypeIdInclusion) || !write(writableTypeIdInclusion2, i, writableTypeIdInclusion)) {
            return false;
        }
        return !RemoteActionCompatParcelizer(writableTypeIdInclusion3, i, writableTypeIdInclusion) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver()) || IconCompatParcelizer(writableTypeIdInclusion2, i, writableTypeIdInclusion) < AudioAttributesCompatParcelizer(writableTypeIdInclusion3, i, writableTypeIdInclusion);
    }

    private static final WritableTypeIdInclusion read(WritableTypeIdInclusion writableTypeIdInclusion) {
        return new WritableTypeIdInclusion(writableTypeIdInclusion.getAudioAttributesCompatParcelizer(), writableTypeIdInclusion.getRemoteActionCompatParcelizer(), writableTypeIdInclusion.getAudioAttributesCompatParcelizer(), writableTypeIdInclusion.getRemoteActionCompatParcelizer());
    }

    private static final WritableTypeIdInclusion IconCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion) {
        return new WritableTypeIdInclusion(writableTypeIdInclusion.getWrite(), writableTypeIdInclusion.getIconCompatParcelizer(), writableTypeIdInclusion.getWrite(), writableTypeIdInclusion.getIconCompatParcelizer());
    }

    private static final _handleSpillOverflow AudioAttributesCompatParcelizer(_handleSpillOverflow _handlespilloverflow) {
        if (_handlespilloverflow.AudioAttributesCompatParcelizer() != _addSymbol.write) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
        }
        _handleSpillOverflow _handlespilloverflowIconCompatParcelizer = _hashToIndex.IconCompatParcelizer(_handlespilloverflow);
        if (_handlespilloverflowIconCompatParcelizer != null) {
            return _handlespilloverflowIconCompatParcelizer;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    public static final boolean write(_handleSpillOverflow _handlespilloverflow, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer;
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleSpillOverflow[16], 0);
        RemoteActionCompatParcelizer(_handlespilloverflow, uTF32Reader);
        if (uTF32Reader.getAudioAttributesCompatParcelizer() <= 1) {
            _handleSpillOverflow _handlespilloverflow2 = (_handleSpillOverflow) (uTF32Reader.getAudioAttributesCompatParcelizer() == 0 ? null : uTF32Reader.IconCompatParcelizer[0]);
            if (_handlespilloverflow2 != null) {
                return getanswermap.invoke(_handlespilloverflow2).booleanValue();
            }
            return false;
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.RemoteActionCompatParcelizer())) {
            i = _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver();
        }
        if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.MediaBrowserCompatItemReceiver()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.IconCompatParcelizer())) {
            writableTypeIdInclusionIconCompatParcelizer = read(_hashToIndex.write(_handlespilloverflow));
        } else if (_checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.read()) || _checkNeedForRehash.IconCompatParcelizer(i, _checkNeedForRehash.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            writableTypeIdInclusionIconCompatParcelizer = IconCompatParcelizer(_hashToIndex.write(_handlespilloverflow));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        _handleSpillOverflow _handlespilloverflowWrite = write((UTF32Reader<_handleSpillOverflow>) uTF32Reader, writableTypeIdInclusionIconCompatParcelizer, i);
        if (_handlespilloverflowWrite != null) {
            return getanswermap.invoke(_handlespilloverflowWrite).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(_handleSpillOverflow _handlespilloverflow, WritableTypeIdInclusion writableTypeIdInclusion, int i, getAnswerMap<? super _handleSpillOverflow, Boolean> getanswermap) {
        _handleSpillOverflow _handlespilloverflowWrite;
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleSpillOverflow[16], 0);
        _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
        int iWrite = _bind.write(1024);
        if (!_handlespilloverflow2.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitChildren called on an unattached node");
        }
        UTF32Reader uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = _handlespilloverflow2.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader2, _handlespilloverflow2.getRead(), false);
        } else {
            uTF32Reader2.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader2.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = (_handleOddName.IconCompatParcelizer) uTF32Reader2.RemoteActionCompatParcelizer(uTF32Reader2.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizerWrite.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                collectLongDefaults.read(uTF32Reader2, iconCompatParcelizerWrite, false);
            } else {
                while (true) {
                    if (iconCompatParcelizerWrite == null) {
                        break;
                    }
                    if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0) {
                        UTF32Reader uTF32Reader3 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                _handleSpillOverflow _handlespilloverflow3 = (_handleSpillOverflow) iconCompatParcelizerWrite;
                                if (_handlespilloverflow3.getRatingCompat()) {
                                    uTF32Reader.read(_handlespilloverflow3);
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i2 = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader3 == null) {
                                                uTF32Reader3 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader3 != null) {
                                                    uTF32Reader3.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader3 != null) {
                                                uTF32Reader3.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader3);
                        }
                    } else {
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite.getAudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0 && (_handlespilloverflowWrite = write((UTF32Reader<_handleSpillOverflow>) uTF32Reader, writableTypeIdInclusion, i)) != null) {
            if (_handlespilloverflowWrite.read().getIconCompatParcelizer()) {
                return getanswermap.invoke(_handlespilloverflowWrite).booleanValue();
            }
            if (read(_handlespilloverflowWrite, writableTypeIdInclusion, i, getanswermap)) {
                return true;
            }
            uTF32Reader.IconCompatParcelizer(_handlespilloverflowWrite);
        }
        return false;
    }

    private static final void RemoteActionCompatParcelizer(Module module, UTF32Reader<_handleSpillOverflow> uTF32Reader) {
        int iWrite = _bind.write(1024);
        if (!module.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitChildren called on an unattached node");
        }
        UTF32Reader uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = module.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader2, module.getRead(), false);
        } else {
            uTF32Reader2.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader2.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = (_handleOddName.IconCompatParcelizer) uTF32Reader2.RemoteActionCompatParcelizer(uTF32Reader2.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizerWrite.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                collectLongDefaults.read(uTF32Reader2, iconCompatParcelizerWrite, false);
            } else {
                while (true) {
                    if (iconCompatParcelizerWrite == null) {
                        break;
                    }
                    if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0) {
                        UTF32Reader uTF32Reader3 = null;
                        while (iconCompatParcelizerWrite != null) {
                            if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                                _handleSpillOverflow _handlespilloverflow = (_handleSpillOverflow) iconCompatParcelizerWrite;
                                if (_handlespilloverflow.getRatingCompat()) {
                                    _handleSpillOverflow _handlespilloverflow2 = _handlespilloverflow;
                                    if (!collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow2).getAddOnUserLeaveHintListener()) {
                                        if (_handlespilloverflow.read().getIconCompatParcelizer()) {
                                            uTF32Reader.read(_handlespilloverflow);
                                        } else {
                                            RemoteActionCompatParcelizer(_handlespilloverflow2, uTF32Reader);
                                        }
                                    }
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                int i = 0;
                                for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                    if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer;
                                        } else {
                                            if (uTF32Reader3 == null) {
                                                uTF32Reader3 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != null) {
                                                if (uTF32Reader3 != null) {
                                                    uTF32Reader3.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = null;
                                            }
                                            if (uTF32Reader3 != null) {
                                                uTF32Reader3.read(iconCompatParcelizer);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader3);
                        }
                    } else {
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite.getAudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
    }
}
