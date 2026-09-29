package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d"}, d2 = {"Lo/sourceDescription;", "Lo/addAbstractTypeResolver;", "Lo/getLongMask;", "Lo/_prefetchRootDeserializer;", "Lo/inset;", "p0", "", "p1", "Lo/assignParameter;", "p2", "Lo/MinimalPrettyPrinter;", "p3", "<init>", "(Lo/inset;ZFLo/MinimalPrettyPrinter;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "c_", "()V", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "write", "read", "IconCompatParcelizer", "Lo/inset;", "RemoteActionCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "F", "Lo/MinimalPrettyPrinter;", "Lo/Module;", "Lo/Module;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class sourceDescription extends addAbstractTypeResolver implements getLongMask, _prefetchRootDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Module write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final inset RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final MinimalPrettyPrinter read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    private sourceDescription(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter) {
        this.RemoteActionCompatParcelizer = insetVar;
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = f;
        this.read = minimalPrettyPrinter;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin._prefetchRootDeserializer
    public final void MediaMetadataCompat() {
        MediaBrowserCompatItemReceiver();
    }

    private final void MediaBrowserCompatItemReceiver() {
        _detectBindAndClose.read(this, new getCreatedOnDateMs() { // from class: o.appendOffsetDescription
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return sourceDescription.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(sourceDescription sourcedescription) {
        if (((getTextOffset) MappingJsonFactory.write(sourcedescription, hasTextCharacters.AudioAttributesCompatParcelizer())) == null) {
            sourcedescription.read();
        } else if (sourcedescription.write == null) {
            sourcedescription.write();
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements MinimalPrettyPrinter {
        @Override // kotlin.MinimalPrettyPrinter
        public final long write() {
            long jWrite = sourceDescription.this.read.write();
            if (jWrite != 16) {
                return jWrite;
            }
            getTextOffset gettextoffset = (getTextOffset) MappingJsonFactory.write(sourceDescription.this, hasTextCharacters.AudioAttributesCompatParcelizer());
            if (gettextoffset != null && gettextoffset.getRead() != 16) {
                return gettextoffset.getRead();
            }
            return ((switchToNext) MappingJsonFactory.write(sourceDescription.this, writeTypeSuffix.IconCompatParcelizer())).getIconCompatParcelizer();
        }

        IconCompatParcelizer() {
        }
    }

    private final void write() {
        this.write = AudioAttributesCompatParcelizer(setPrettyPrinter.write(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, new IconCompatParcelizer(), new getCreatedOnDateMs() { // from class: o.JsonGenerator1
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return sourceDescription.read(this.AudioAttributesCompatParcelizer);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setCurrentValue read(sourceDescription sourcedescription) {
        setCurrentValue audioAttributesCompatParcelizer;
        getTextOffset gettextoffset = (getTextOffset) MappingJsonFactory.write(sourcedescription, hasTextCharacters.AudioAttributesCompatParcelizer());
        return (gettextoffset == null || (audioAttributesCompatParcelizer = gettextoffset.getAudioAttributesCompatParcelizer()) == null) ? getValueAsLong.INSTANCE.RemoteActionCompatParcelizer() : audioAttributesCompatParcelizer;
    }

    private final void read() {
        Module module = this.write;
        if (module != null) {
            IconCompatParcelizer(module);
        }
        this.write = null;
    }

    public /* synthetic */ sourceDescription(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(insetVar, z, f, minimalPrettyPrinter);
    }
}
