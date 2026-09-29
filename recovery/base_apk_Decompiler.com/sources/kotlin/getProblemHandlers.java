package kotlin;

import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.createForPropertyOverride;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0014J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010\u0014R\u001e\u0010'\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010$\"\u0004\b%\u0010&R$\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\u001b\u0010(\"\u0004\b\u0011\u0010\u001cR*\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010)\u001a\u0004\b\u0011\u0010*\"\u0004\b\u001b\u0010+R\u0016\u0010\u001b\u001a\u0004\u0018\u00010,8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u00102\u001a\u00020/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101"}, d2 = {"Lo/getProblemHandlers;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/createForPropertyOverride;", "Lo/forRootType;", "Lo/getLongMask;", "Lo/extractScalarFromObject;", "p0", "", "p1", "Lo/addKeyDeserializers;", "p2", "<init>", "(Lo/extractScalarFromObject;ZLo/addKeyDeserializers;)V", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "Lo/getKey;", "", "write", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "onSetPlaybackSpeed", "()V", "onSetCaptioningEnabled", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "Lo/handleWeirdNumberValue;", "AudioAttributesCompatParcelizer", "(I)Z", "read", "(Lo/extractScalarFromObject;)V", "AudioAttributesImplApi26Parcelizer", "onRemoveQueueItem", "onRewind", "()Lo/getProblemHandlers;", "MediaMetadataCompat", "onSetRepeatMode", "RatingCompat", "Lo/addKeyDeserializers;", "RemoteActionCompatParcelizer", "(Lo/addKeyDeserializers;)V", "IconCompatParcelizer", "Lo/extractScalarFromObject;", "Z", "()Z", "(Z)V", "Lo/findContextualValueDeserializer;", "AudioAttributesImplApi21Parcelizer", "()Lo/findContextualValueDeserializer;", "Lo/withNulls;", "f_", "()J", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getProblemHandlers extends _handleOddName.IconCompatParcelizer implements createForPropertyOverride, forRootType, getLongMask {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private addKeyDeserializers IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private extractScalarFromObject AudioAttributesCompatParcelizer;

    public abstract boolean AudioAttributesCompatParcelizer(int p0);

    public abstract void read(extractScalarFromObject p0);

    public getProblemHandlers(extractScalarFromObject extractscalarfromobject, boolean z, addKeyDeserializers addkeydeserializers) {
        this.IconCompatParcelizer = addkeydeserializers;
        this.AudioAttributesCompatParcelizer = extractscalarfromobject;
        this.write = z;
    }

    public /* synthetic */ getProblemHandlers(extractScalarFromObject extractscalarfromobject, boolean z, addKeyDeserializers addkeydeserializers, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(extractscalarfromobject, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : addkeydeserializers);
    }

    public final void RemoteActionCompatParcelizer(addKeyDeserializers addkeydeserializers) {
        this.IconCompatParcelizer = addkeydeserializers;
    }

    public final void write(extractScalarFromObject extractscalarfromobject) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, extractscalarfromobject)) {
            return;
        }
        this.AudioAttributesCompatParcelizer = extractscalarfromobject;
        if (this.RemoteActionCompatParcelizer) {
            onRemoveQueueItem();
        }
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void read(boolean z) {
        if (this.write != z) {
            this.write = z;
            if (z) {
                if (this.RemoteActionCompatParcelizer) {
                    AudioAttributesImplApi26Parcelizer();
                }
            } else if (this.RemoteActionCompatParcelizer) {
                MediaMetadataCompat();
            }
        }
    }

    protected final findContextualValueDeserializer AudioAttributesImplApi21Parcelizer() {
        return (findContextualValueDeserializer) MappingJsonFactory.write(this, getDefaultNullValueSerializer.MediaDescriptionCompat());
    }

    @Override // kotlin.forRootType
    public void write(DeserializationContext p0, _shapeForToken p1, long p2) {
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            int size = listAudioAttributesCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                if (AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer.get(i).getMediaBrowserCompatItemReceiver())) {
                    if (constructCalendar.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), constructCalendar.INSTANCE.read())) {
                        onSetPlaybackSpeed();
                        return;
                    } else {
                        if (constructCalendar.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), constructCalendar.INSTANCE.AudioAttributesCompatParcelizer())) {
                            onSetCaptioningEnabled();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    private final void onSetPlaybackSpeed() {
        this.RemoteActionCompatParcelizer = true;
        onRemoveQueueItem();
    }

    private final void onSetCaptioningEnabled() {
        if (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = false;
            if (getRatingCompat()) {
                RatingCompat();
            }
        }
    }

    @Override // kotlin.forRootType
    public void MediaBrowserCompatMediaItem() {
        onSetCaptioningEnabled();
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void MediaDescriptionCompat() {
        onSetCaptioningEnabled();
        super.MediaDescriptionCompat();
    }

    @Override // kotlin.forRootType
    public long f_() {
        addKeyDeserializers addkeydeserializers = this.IconCompatParcelizer;
        return addkeydeserializers != null ? addkeydeserializers.write(collectLongDefaults.write((Module) this)) : withNulls.INSTANCE.RemoteActionCompatParcelizer();
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        extractScalarFromObject extractscalarfromobject;
        getProblemHandlers getproblemhandlersOnSetRepeatMode = onSetRepeatMode();
        if (getproblemhandlersOnSetRepeatMode == null || (extractscalarfromobject = getproblemhandlersOnSetRepeatMode.AudioAttributesCompatParcelizer) == null) {
            extractscalarfromobject = this.AudioAttributesCompatParcelizer;
        }
        read(extractscalarfromobject);
    }

    private final void onRemoveQueueItem() {
        MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        audioAttributesCompatParcelizer.IconCompatParcelizer = true;
        if (!this.write) {
            PropertyName.read(this, (getAnswerMap<? super getProblemHandlers, ? extends createForPropertyOverride.Companion.IconCompatParcelizer>) new AnonymousClass4(audioAttributesCompatParcelizer));
        }
        if (audioAttributesCompatParcelizer.IconCompatParcelizer) {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    /* JADX INFO: renamed from: o.getProblemHandlers$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getProblemHandlers;", "p0", "Lo/createForPropertyOverride$write$IconCompatParcelizer;", "IconCompatParcelizer", "(Lo/getProblemHandlers;)Lo/createForPropertyOverride$write$IconCompatParcelizer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<getProblemHandlers, createForPropertyOverride.Companion.IconCompatParcelizer> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final createForPropertyOverride.Companion.IconCompatParcelizer invoke(getProblemHandlers getproblemhandlers) {
            if (getproblemhandlers.RemoteActionCompatParcelizer) {
                this.$RemoteActionCompatParcelizer.IconCompatParcelizer = false;
                return createForPropertyOverride.Companion.IconCompatParcelizer.write;
            }
            return createForPropertyOverride.Companion.IconCompatParcelizer.read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(1);
            this.$RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final getProblemHandlers onRewind() {
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        PropertyName.read(this, (getAnswerMap<? super getProblemHandlers, ? extends createForPropertyOverride.Companion.IconCompatParcelizer>) new AnonymousClass5(writeVar));
        return (getProblemHandlers) writeVar.write;
    }

    /* JADX INFO: renamed from: o.getProblemHandlers$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getProblemHandlers;", "p0", "Lo/createForPropertyOverride$write$IconCompatParcelizer;", "read", "(Lo/getProblemHandlers;)Lo/createForPropertyOverride$write$IconCompatParcelizer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<getProblemHandlers, createForPropertyOverride.Companion.IconCompatParcelizer> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getProblemHandlers> $IconCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final createForPropertyOverride.Companion.IconCompatParcelizer invoke(getProblemHandlers getproblemhandlers) {
            createForPropertyOverride.Companion.IconCompatParcelizer iconCompatParcelizer = createForPropertyOverride.Companion.IconCompatParcelizer.read;
            if (getproblemhandlers.RemoteActionCompatParcelizer) {
                this.$IconCompatParcelizer.write = getproblemhandlers;
                if (getproblemhandlers.getWrite()) {
                    return createForPropertyOverride.Companion.IconCompatParcelizer.IconCompatParcelizer;
                }
            }
            return iconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(MagicModuleUseCaseImplWhenMappings.write<getProblemHandlers> writeVar) {
            super(1);
            this.$IconCompatParcelizer = writeVar;
        }
    }

    private final void MediaMetadataCompat() {
        getProblemHandlers getproblemhandlersOnRewind;
        if (this.RemoteActionCompatParcelizer) {
            if (!this.write && (getproblemhandlersOnRewind = onRewind()) != null) {
                this = getproblemhandlersOnRewind;
            }
            this.AudioAttributesImplApi26Parcelizer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final getProblemHandlers onSetRepeatMode() {
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        PropertyName.RemoteActionCompatParcelizer(this, new AnonymousClass1(writeVar));
        return (getProblemHandlers) writeVar.write;
    }

    /* JADX INFO: renamed from: o.getProblemHandlers$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getProblemHandlers;", "p0", "", "read", "(Lo/getProblemHandlers;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<getProblemHandlers, Boolean> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getProblemHandlers> $AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(getProblemHandlers getproblemhandlers) {
            if (getproblemhandlers.getWrite() && getproblemhandlers.RemoteActionCompatParcelizer) {
                this.$AudioAttributesCompatParcelizer.write = getproblemhandlers;
            }
            return Boolean.TRUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MagicModuleUseCaseImplWhenMappings.write<getProblemHandlers> writeVar) {
            super(1);
            this.$AudioAttributesCompatParcelizer = writeVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void RatingCompat() {
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        PropertyName.RemoteActionCompatParcelizer(this, new AnonymousClass2(writeVar));
        getProblemHandlers getproblemhandlers = (getProblemHandlers) writeVar.write;
        if (getproblemhandlers != null) {
            getproblemhandlers.AudioAttributesImplApi26Parcelizer();
        } else {
            read((extractScalarFromObject) null);
        }
    }

    /* JADX INFO: renamed from: o.getProblemHandlers$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getProblemHandlers;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/getProblemHandlers;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<getProblemHandlers, Boolean> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getProblemHandlers> $write;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(getProblemHandlers getproblemhandlers) {
            if (this.$write.write == null && getproblemhandlers.RemoteActionCompatParcelizer) {
                this.$write.write = getproblemhandlers;
            } else if (this.$write.write != null && getproblemhandlers.getWrite() && getproblemhandlers.RemoteActionCompatParcelizer) {
                this.$write.write = getproblemhandlers;
            }
            return Boolean.TRUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MagicModuleUseCaseImplWhenMappings.write<getProblemHandlers> writeVar) {
            super(1);
            this.$write = writeVar;
        }
    }
}
