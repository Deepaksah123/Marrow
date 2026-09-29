package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._deserializeFromObjectId;
import kotlin.resetWithString;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\r\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\f\u0010\u0017J!\u0010\u000e\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u000e\u0010\u0019J\u001f\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0011\u0010\u001bJ\u000f\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u001cJ;\u0010 \u001a\u00020\u00162\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u001d\"\u0004\u0018\u00010\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00160\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R/\u0010\u0011\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010#\u001a\u0004\b \u0010$\"\u0004\b\n\u0010%R\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\n\u0010\"R&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00160\u001e0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020)0(8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010*"}, d2 = {"Lo/notifyItemChanged;", "", "Lo/AbstractDeserializer;", "p0", "<init>", "(Lo/AbstractDeserializer;)V", "Lo/_handleOddName;", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_deserializeFromObjectId;", "Lo/IconCompatParcelizer;", "read", "(Lo/_handleOddName;Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Lo/_handleOddName;", "AudioAttributesCompatParcelizer", "Lo/findAndAddVirtualProperties;", "RemoteActionCompatParcelizer", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Lo/findAndAddVirtualProperties;", "Lo/removeSoftRefsClearedByGc;", "IconCompatParcelizer", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Lo/removeSoftRefsClearedByGc;", "Lo/deserializeFromNumber;", "p1", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;Lo/deserializeFromNumber;)Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "", "(Lo/_handleUnrecognizedCharacterEscape;I)V", "Lo/_findPropertyUnwrapper;", "(Lo/_findPropertyUnwrapper;Lo/_findPropertyUnwrapper;)Lo/_findPropertyUnwrapper;", "Lo/getDateFormat;", "(Lo/_deserializeFromObjectId;Lo/getDateFormat;)V", "()Lo/AbstractDeserializer;", "", "Lkotlin/Function1;", "Lo/setAllowMultipleOverrides;", "write", "([Ljava/lang/Object;Lo/getAnswerMap;Lo/_handleUnrecognizedCharacterEscape;I)V", "Lo/AbstractDeserializer;", "Lo/InputAccessor;", "()Lo/deserializeFromNumber;", "(Lo/deserializeFromNumber;)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function0;", "", "()Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class notifyItemChanged {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final AbstractDeserializer read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public AbstractDeserializer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final SnapshotStateList<getAnswerMap<setAllowMultipleOverrides, getShowPopup>> RemoteActionCompatParcelizer = _qbuf.write();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements _wrapError {
        final /* synthetic */ getAnswerMap read;

        public write(getAnswerMap getanswermap) {
            this.read = getanswermap;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            notifyItemChanged.this.RemoteActionCompatParcelizer.remove(this.read);
        }
    }

    public notifyItemChanged(AbstractDeserializer abstractDeserializer) {
        this.read = abstractDeserializer;
        this.AudioAttributesCompatParcelizer = abstractDeserializer.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.onViewDetachedFromWindow
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return notifyItemChanged.read((AbstractDeserializer.AudioAttributesCompatParcelizer) obj);
            }
        });
    }

    public final void read(deserializeFromNumber deserializefromnumber) {
        this.IconCompatParcelizer.write(deserializefromnumber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final deserializeFromNumber write() {
        return (deserializeFromNumber) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List read(o.AbstractDeserializer.AudioAttributesCompatParcelizer r25) {
        /*
            java.lang.Object r0 = r25.IconCompatParcelizer()
            boolean r0 = r0 instanceof kotlin._deserializeFromObjectId
            if (r0 == 0) goto L71
            java.lang.Object r0 = r25.IconCompatParcelizer()
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r0, r1)
            o._deserializeFromObjectId r0 = (kotlin._deserializeFromObjectId) r0
            o.deserializeFromEmbedded r0 = r0.getRead()
            boolean r0 = kotlin.onFailedToRecycleView.RemoteActionCompatParcelizer(r0)
            if (r0 != 0) goto L71
            r0 = 2
            o.AbstractDeserializer$AudioAttributesCompatParcelizer[] r0 = new o.AbstractDeserializer.AudioAttributesCompatParcelizer[r0]
            r2 = 0
            r0[r2] = r25
            java.lang.Object r2 = r25.IconCompatParcelizer()
            kotlin.toMagicModuleMetaRepoModel.read(r2, r1)
            o._deserializeFromObjectId r2 = (kotlin._deserializeFromObjectId) r2
            o.deserializeFromEmbedded r1 = r2.getRead()
            if (r1 == 0) goto L38
            o._findPropertyUnwrapper r1 = r1.getIconCompatParcelizer()
            if (r1 != 0) goto L5c
        L38:
            o._findPropertyUnwrapper r1 = new o._findPropertyUnwrapper
            r2 = r1
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 65535(0xffff, float:9.1834E-41)
            r24 = 0
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
        L5c:
            int r2 = r25.AudioAttributesImplBaseParcelizer()
            int r3 = r25.getAudioAttributesCompatParcelizer()
            o.AbstractDeserializer$AudioAttributesCompatParcelizer r4 = new o.AbstractDeserializer$AudioAttributesCompatParcelizer
            r4.<init>(r1, r2, r3)
            r1 = 1
            r0[r1] = r4
            java.util.ArrayList r0 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r0)
            goto L79
        L71:
            o.AbstractDeserializer$AudioAttributesCompatParcelizer[] r0 = new o.AbstractDeserializer.AudioAttributesCompatParcelizer[]{r25}
            java.util.ArrayList r0 = kotlin.IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(r0)
        L79:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.notifyItemChanged.read(o.AbstractDeserializer$AudioAttributesCompatParcelizer):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(notifyItemChanged notifyitemchanged) {
        deserializeFromBoolean iconCompatParcelizer;
        AbstractDeserializer abstractDeserializer = notifyitemchanged.AudioAttributesCompatParcelizer;
        deserializeFromNumber deserializefromnumberWrite = notifyitemchanged.write();
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractDeserializer, (deserializefromnumberWrite == null || (iconCompatParcelizer = deserializefromnumberWrite.getIconCompatParcelizer()) == null) ? null : iconCompatParcelizer.getWrite());
    }

    public final getCreatedOnDateMs<Boolean> RemoteActionCompatParcelizer() {
        return new getCreatedOnDateMs() { // from class: o.notifyItemMoved
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(notifyItemChanged.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
            }
        };
    }

    private final _handleOddName read(_handleOddName _handleoddname, final AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> audioAttributesCompatParcelizer) {
        return _handleoddname.AudioAttributesCompatParcelizer(new RecyclerViewLayoutParams(new unregisterAdapterDataObserver() { // from class: o.notifyItemRangeInserted
            @Override // kotlin.unregisterAdapterDataObserver
            public final setHasStableIds write(RecyclerViewSavedState recyclerViewSavedState) {
                return notifyItemChanged.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer, recyclerViewSavedState);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setHasStableIds RemoteActionCompatParcelizer(notifyItemChanged notifyitemchanged, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, RecyclerViewSavedState recyclerViewSavedState) {
        deserializeFromNumber deserializefromnumberWrite = notifyitemchanged.write();
        if (deserializefromnumberWrite == null) {
            return recyclerViewSavedState.RemoteActionCompatParcelizer(0, 0, new getCreatedOnDateMs() { // from class: o.onCreateViewHolder
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return notifyItemChanged.MediaBrowserCompatCustomActionResultReceiver();
                }
            });
        }
        AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> audioAttributesCompatParcelizerRemoteActionCompatParcelizer = notifyitemchanged.RemoteActionCompatParcelizer((AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId>) audioAttributesCompatParcelizer, deserializefromnumberWrite);
        if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer == null) {
            return recyclerViewSavedState.RemoteActionCompatParcelizer(0, 0, new getCreatedOnDateMs() { // from class: o.onBindViewHolder
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return notifyItemChanged.AudioAttributesImplApi26Parcelizer();
                }
            });
        }
        final appendReferring appendreferringAudioAttributesCompatParcelizer = ReadableObjectId.AudioAttributesCompatParcelizer(deserializefromnumberWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()).IconCompatParcelizer());
        return recyclerViewSavedState.RemoteActionCompatParcelizer(appendreferringAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(), appendreferringAudioAttributesCompatParcelizer.IconCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.notifyItemRemoved
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return notifyItemChanged.write(appendreferringAudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasReferringProperties MediaBrowserCompatCustomActionResultReceiver() {
        return hasReferringProperties.write(hasReferringProperties.INSTANCE.write());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasReferringProperties AudioAttributesImplApi26Parcelizer() {
        return hasReferringProperties.write(hasReferringProperties.INSTANCE.write());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasReferringProperties write(appendReferring appendreferring) {
        return hasReferringProperties.write(appendreferring.AudioAttributesImplBaseParcelizer());
    }

    private final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> audioAttributesCompatParcelizer) {
        return expand.IconCompatParcelizer(_handleoddname, new getAnswerMap() { // from class: o.getStateRestorationPolicy
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return notifyItemChanged.RemoteActionCompatParcelizer(this.IconCompatParcelizer, audioAttributesCompatParcelizer, (validateAppend) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(notifyItemChanged notifyitemchanged, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, validateAppend validateappend) {
        findAndAddVirtualProperties findandaddvirtualpropertiesRemoteActionCompatParcelizer = notifyitemchanged.RemoteActionCompatParcelizer((AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId>) audioAttributesCompatParcelizer);
        if (findandaddvirtualpropertiesRemoteActionCompatParcelizer != null) {
            validateappend.write(findandaddvirtualpropertiesRemoteActionCompatParcelizer);
            validateappend.IconCompatParcelizer(true);
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/notifyItemChanged$read;", "Lo/findAndAddVirtualProperties;", "Lo/calloc;", "p0", "Lo/tryToResolveUnresolved;", "p1", "Lo/bufferMapProperty;", "p2", "Lo/resetWithString;", "write", "(JLo/tryToResolveUnresolved;Lo/bufferMapProperty;)Lo/resetWithString;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements findAndAddVirtualProperties {
        final /* synthetic */ removeSoftRefsClearedByGc write;

        read(removeSoftRefsClearedByGc removesoftrefsclearedbygc) {
            this.write = removesoftrefsclearedbygc;
        }

        @Override // kotlin.findAndAddVirtualProperties
        public final resetWithString write(long p0, tryToResolveUnresolved p1, bufferMapProperty p2) {
            return new resetWithString.AudioAttributesCompatParcelizer(this.write);
        }
    }

    private final findAndAddVirtualProperties RemoteActionCompatParcelizer(AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> p0) {
        removeSoftRefsClearedByGc removesoftrefsclearedbygcIconCompatParcelizer = IconCompatParcelizer(p0);
        return removesoftrefsclearedbygcIconCompatParcelizer != null ? new read(removesoftrefsclearedbygcIconCompatParcelizer) : null;
    }

    private final removeSoftRefsClearedByGc IconCompatParcelizer(AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> p0) {
        deserializeFromNumber deserializefromnumberWrite;
        AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> audioAttributesCompatParcelizerRemoteActionCompatParcelizer;
        if (!RemoteActionCompatParcelizer().invoke().booleanValue() || (deserializefromnumberWrite = write()) == null || (audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, deserializefromnumberWrite)) == null) {
            return null;
        }
        removeSoftRefsClearedByGc removesoftrefsclearedbygcRemoteActionCompatParcelizer = deserializefromnumberWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer());
        WritableTypeIdInclusion writableTypeIdInclusionWrite = deserializefromnumberWrite.write(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer());
        long j = -1;
        removesoftrefsclearedbygcRemoteActionCompatParcelizer.read(getReferencedType.AudioAttributesCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(deserializefromnumberWrite.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()) == deserializefromnumberWrite.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() + (-1)) ? Math.min(deserializefromnumberWrite.write(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() - 1).getAudioAttributesCompatParcelizer(), writableTypeIdInclusionWrite.getAudioAttributesCompatParcelizer()) : BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))) ^ (-9223372034707292160L)));
        return removesoftrefsclearedbygcRemoteActionCompatParcelizer;
    }

    private final AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> RemoteActionCompatParcelizer(AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> p0, deserializeFromNumber p1) {
        int iWrite$default = deserializeFromNumber.write$default(p1, p1.AudioAttributesImplBaseParcelizer() - 1, false, 2, null);
        if (p0.AudioAttributesImplBaseParcelizer() < iWrite$default) {
            return AbstractDeserializer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer$default(p0, null, 0, Math.min(p0.getAudioAttributesCompatParcelizer(), iWrite$default), null, 11, null);
        }
        return null;
    }

    public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1154651354);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1154651354, i2, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final getDateFormat getdateformat = (getDateFormat) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.onCommand());
            AbstractDeserializer abstractDeserializer = this.AudioAttributesCompatParcelizer;
            List<AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId>> listWrite = abstractDeserializer.write(0, abstractDeserializer.length());
            int size = listWrite.size();
            int i5 = 0;
            while (i5 < size) {
                final AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> audioAttributesCompatParcelizer = listWrite.get(i5);
                if (audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer() == audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(716130110);
                } else {
                    _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(725478935);
                    Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                    if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = isConsumed.RemoteActionCompatParcelizer();
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                    }
                    hashCode hashcode = (hashCode) objOnPause;
                    _handleOddName _handleoddnameAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, audioAttributesCompatParcelizer);
                    Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
                    if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause2 = new getAnswerMap() { // from class: o.notifyItemInserted
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return notifyItemChanged.AudioAttributesCompatParcelizer((getConfigOverride) obj);
                            }
                        };
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
                    }
                    _handleOddName _handleoddname = findObjectId.read$default(getReleaseBlock.RemoteActionCompatParcelizer$default(read(withValueInstantiators.read$default(_handleoddnameAudioAttributesCompatParcelizer, false, (getAnswerMap) objOnPause2, i4, null), audioAttributesCompatParcelizer), hashcode, false, i3, null), extractScalarFromObject.INSTANCE.write(), false, i3, null);
                    boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this);
                    boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
                    boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getdateformat);
                    Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
                    if ((zIconCompatParcelizer | zAudioAttributesCompatParcelizer | zIconCompatParcelizer2) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause3 = new getCreatedOnDateMs() { // from class: o.notifyItemRangeChanged
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return notifyItemChanged.IconCompatParcelizer(this.read, audioAttributesCompatParcelizer, getdateformat);
                            }
                        };
                        _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
                    }
                    AbsSavedState1.RemoteActionCompatParcelizer(getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer(_handleoddname, hashcode, null, (TarConstants.XSTAR_MAGIC_OFFSET & 4) != 0, (TarConstants.XSTAR_MAGIC_OFFSET & 8) != 0 ? null : null, (TarConstants.XSTAR_MAGIC_OFFSET & 16) != 0 ? null : null, (TarConstants.XSTAR_MAGIC_OFFSET & 32) != 0 ? null : null, (TarConstants.XSTAR_MAGIC_OFFSET & 64) != 0 ? null : null, (TarConstants.XSTAR_MAGIC_OFFSET & 128) != 0 ? null : null, (TarConstants.XSTAR_MAGIC_OFFSET & 256) != 0, (getCreatedOnDateMs) objOnPause3), _handleunrecognizedcharacterescapeWrite, 0);
                    if (onFailedToRecycleView.write(audioAttributesCompatParcelizer.IconCompatParcelizer().getRead())) {
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(716130110);
                    } else {
                        _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(726303039);
                        Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
                        if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause4 = new setShutterBackgroundColor(hashcode);
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
                        }
                        final setShutterBackgroundColor setshutterbackgroundcolor = (setShutterBackgroundColor) objOnPause4;
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
                        if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause5 = (MagicModuleSubmissionRequestBody) new AudioAttributesCompatParcelizer(setshutterbackgroundcolor, null);
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
                        }
                        StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) objOnPause5, _handleunrecognizedcharacterescapeWrite, 6);
                        boolean zWrite = setshutterbackgroundcolor.write();
                        boolean z = setshutterbackgroundcolor.read();
                        boolean zRemoteActionCompatParcelizer = setshutterbackgroundcolor.RemoteActionCompatParcelizer();
                        deserializeFromEmbedded read2 = audioAttributesCompatParcelizer.IconCompatParcelizer().getRead();
                        _findPropertyUnwrapper iconCompatParcelizer = read2 != null ? read2.getIconCompatParcelizer() : null;
                        deserializeFromEmbedded read3 = audioAttributesCompatParcelizer.IconCompatParcelizer().getRead();
                        _findPropertyUnwrapper audioAttributesCompatParcelizer2 = read3 != null ? read3.getAudioAttributesCompatParcelizer() : null;
                        deserializeFromEmbedded read4 = audioAttributesCompatParcelizer.IconCompatParcelizer().getRead();
                        _findPropertyUnwrapper read5 = read4 != null ? read4.getRead() : null;
                        deserializeFromEmbedded read6 = audioAttributesCompatParcelizer.IconCompatParcelizer().getRead();
                        Object[] objArr = {Boolean.valueOf(zWrite), Boolean.valueOf(z), Boolean.valueOf(zRemoteActionCompatParcelizer), iconCompatParcelizer, audioAttributesCompatParcelizer2, read5, read6 != null ? read6.getWrite() : null};
                        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this);
                        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
                        Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
                        if ((zIconCompatParcelizer3 | zAudioAttributesCompatParcelizer2) || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause6 = new getAnswerMap() { // from class: o.notifyItemRangeRemoved
                                @Override // kotlin.getAnswerMap
                                public final Object invoke(Object obj) {
                                    return notifyItemChanged.write(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer, setshutterbackgroundcolor, (setAllowMultipleOverrides) obj);
                                }
                            };
                            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause6);
                        }
                        write(objArr, (getAnswerMap<? super setAllowMultipleOverrides, getShowPopup>) objOnPause6, _handleunrecognizedcharacterescapeWrite, (i2 << 6) & 896);
                    }
                    _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                }
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                i5++;
                i3 = 2;
                i4 = 1;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.hasObservers
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return notifyItemChanged.RemoteActionCompatParcelizer(this.IconCompatParcelizer, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride) {
        getconfigoverride.write(_this.INSTANCE.onFastForward(), getShowPopup.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(notifyItemChanged notifyitemchanged, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getDateFormat getdateformat) {
        notifyitemchanged.IconCompatParcelizer((_deserializeFromObjectId) audioAttributesCompatParcelizer.IconCompatParcelizer(), getdateformat);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setShutterBackgroundColor read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (this.read.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(setShutterBackgroundColor setshutterbackgroundcolor, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = setshutterbackgroundcolor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(notifyItemChanged notifyitemchanged, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, setShutterBackgroundColor setshutterbackgroundcolor, setAllowMultipleOverrides setallowmultipleoverrides) {
        deserializeFromEmbedded read2;
        deserializeFromEmbedded read3;
        deserializeFromEmbedded read4;
        deserializeFromEmbedded read5 = ((_deserializeFromObjectId) audioAttributesCompatParcelizer.IconCompatParcelizer()).getRead();
        _findPropertyUnwrapper write2 = null;
        _findPropertyUnwrapper _findpropertyunwrapperRemoteActionCompatParcelizer = notifyitemchanged.RemoteActionCompatParcelizer(notifyitemchanged.RemoteActionCompatParcelizer(read5 != null ? read5.getIconCompatParcelizer() : null, (!setshutterbackgroundcolor.read() || (read4 = ((_deserializeFromObjectId) audioAttributesCompatParcelizer.IconCompatParcelizer()).getRead()) == null) ? null : read4.getAudioAttributesCompatParcelizer()), (!setshutterbackgroundcolor.write() || (read3 = ((_deserializeFromObjectId) audioAttributesCompatParcelizer.IconCompatParcelizer()).getRead()) == null) ? null : read3.getRead());
        if (setshutterbackgroundcolor.RemoteActionCompatParcelizer() && (read2 = ((_deserializeFromObjectId) audioAttributesCompatParcelizer.IconCompatParcelizer()).getRead()) != null) {
            write2 = read2.getWrite();
        }
        setallowmultipleoverrides.read(audioAttributesCompatParcelizer, notifyitemchanged.RemoteActionCompatParcelizer(_findpropertyunwrapperRemoteActionCompatParcelizer, write2));
        return getShowPopup.INSTANCE;
    }

    private final _findPropertyUnwrapper RemoteActionCompatParcelizer(_findPropertyUnwrapper _findpropertyunwrapper, _findPropertyUnwrapper _findpropertyunwrapper2) {
        _findPropertyUnwrapper _findpropertyunwrapperAudioAttributesCompatParcelizer;
        return (_findpropertyunwrapper == null || (_findpropertyunwrapperAudioAttributesCompatParcelizer = _findpropertyunwrapper.AudioAttributesCompatParcelizer(_findpropertyunwrapper2)) == null) ? _findpropertyunwrapper2 : _findpropertyunwrapperAudioAttributesCompatParcelizer;
    }

    private final void IconCompatParcelizer(_deserializeFromObjectId p0, getDateFormat p1) {
        _addExplicitAnyCreator audioAttributesCompatParcelizer;
        if (p0 instanceof _deserializeFromObjectId.IconCompatParcelizer) {
            _addExplicitAnyCreator audioAttributesCompatParcelizer2 = ((_deserializeFromObjectId.IconCompatParcelizer) p0).getAudioAttributesCompatParcelizer();
            if (audioAttributesCompatParcelizer2 != null) {
                audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer(p0);
                return;
            } else {
                try {
                    p1.IconCompatParcelizer(((_deserializeFromObjectId.IconCompatParcelizer) p0).getRemoteActionCompatParcelizer());
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
        if (!(p0 instanceof _deserializeFromObjectId.read) || (audioAttributesCompatParcelizer = ((_deserializeFromObjectId.read) p0).getAudioAttributesCompatParcelizer()) == null) {
            return;
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
    }

    public final AbstractDeserializer read() {
        AbstractDeserializer remoteActionCompatParcelizer;
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        } else {
            setAllowMultipleOverrides setallowmultipleoverrides = new setAllowMultipleOverrides(this.AudioAttributesCompatParcelizer);
            SnapshotStateList<getAnswerMap<setAllowMultipleOverrides, getShowPopup>> snapshotStateList = this.RemoteActionCompatParcelizer;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                snapshotStateList.get(i).invoke(setallowmultipleoverrides);
            }
            remoteActionCompatParcelizer = setallowmultipleoverrides.getRemoteActionCompatParcelizer();
        }
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        return remoteActionCompatParcelizer;
    }

    private final void write(final Object[] objArr, final getAnswerMap<? super setAllowMultipleOverrides, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-2083052099);
        int i2 = (i & 48) == 0 ? (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 32 : 16) | i : i;
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this) ? 256 : 128;
        }
        _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(obj) ? 4 : 0;
        }
        _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatItemReceiver();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2083052099, i3, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            MagicModuleMetaUcModel magicModuleMetaUcModel = new MagicModuleMetaUcModel(2);
            magicModuleMetaUcModel.read(getanswermap);
            magicModuleMetaUcModel.write((Object) objArr);
            Object[] objArrWrite = magicModuleMetaUcModel.write(new Object[magicModuleMetaUcModel.RemoteActionCompatParcelizer()]);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this);
            boolean z = (i3 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.onAttachedToRecyclerView
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return notifyItemChanged.write(this.IconCompatParcelizer, getanswermap, (StreamConstraintsException) obj2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.read(objArrWrite, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.onDetachedFromRecyclerView
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return notifyItemChanged.write(this.write, objArr, getanswermap, i, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError write(notifyItemChanged notifyitemchanged, getAnswerMap getanswermap, StreamConstraintsException streamConstraintsException) {
        notifyitemchanged.RemoteActionCompatParcelizer.add(getanswermap);
        return notifyitemchanged.new write(getanswermap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(notifyItemChanged notifyitemchanged, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        notifyitemchanged.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(notifyItemChanged notifyitemchanged, Object[] objArr, getAnswerMap getanswermap, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        notifyitemchanged.write(objArr, (getAnswerMap<? super setAllowMultipleOverrides, getShowPopup>) getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
