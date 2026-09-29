package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d"}, d2 = {"Lo/getThis;", "Lo/addAbstractTypeResolver;", "Lo/getLongMask;", "Lo/_prefetchRootDeserializer;", "Lo/inset;", "p0", "", "p1", "Lo/assignParameter;", "p2", "Lo/MinimalPrettyPrinter;", "p3", "<init>", "(Lo/inset;ZFLo/MinimalPrettyPrinter;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "c_", "()V", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "write", "read", "RemoteActionCompatParcelizer", "Lo/inset;", "Z", "IconCompatParcelizer", "F", "AudioAttributesCompatParcelizer", "Lo/MinimalPrettyPrinter;", "Lo/Module;", "Lo/Module;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getThis extends addAbstractTypeResolver implements getLongMask, _prefetchRootDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final MinimalPrettyPrinter write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Module AudioAttributesCompatParcelizer;
    private final inset RemoteActionCompatParcelizer;
    private final float read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    private getThis(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter) {
        this.RemoteActionCompatParcelizer = insetVar;
        this.IconCompatParcelizer = z;
        this.read = f;
        this.write = minimalPrettyPrinter;
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
        _detectBindAndClose.read(this, new getCreatedOnDateMs() { // from class: o.updateColors
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getThis.IconCompatParcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getThis getthis) {
        if (((contentFilter) MappingJsonFactory.write(getthis, JsonIncludeValue.write())) == null) {
            getthis.read();
        } else if (getthis.AudioAttributesCompatParcelizer == null) {
            getthis.write();
        }
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements MinimalPrettyPrinter {
        @Override // kotlin.MinimalPrettyPrinter
        public final long write() {
            long jWrite = getThis.this.write.write();
            if (jWrite != 16) {
                return jWrite;
            }
            contentFilter contentfilter = (contentFilter) MappingJsonFactory.write(getThis.this, JsonIncludeValue.write());
            if (contentfilter != null && contentfilter.getIconCompatParcelizer() != 16) {
                return contentfilter.getIconCompatParcelizer();
            }
            return JsonInclude.INSTANCE.write(((switchToNext) MappingJsonFactory.write(getThis.this, R.RemoteActionCompatParcelizer())).getIconCompatParcelizer(), ((isFullscreen) MappingJsonFactory.write(getThis.this, setJavaScriptInterface.read())).MediaDescriptionCompat());
        }

        read() {
        }
    }

    private final void write() {
        this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setPrettyPrinter.write(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, new read(), new getCreatedOnDateMs() { // from class: o.width
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getThis.write(this.AudioAttributesCompatParcelizer);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setCurrentValue write(getThis getthis) {
        setCurrentValue remoteActionCompatParcelizer;
        getThis getthis2 = getthis;
        contentFilter contentfilter = (contentFilter) MappingJsonFactory.write(getthis2, JsonIncludeValue.write());
        return (contentfilter == null || (remoteActionCompatParcelizer = contentfilter.getRemoteActionCompatParcelizer()) == null) ? JsonInclude.INSTANCE.IconCompatParcelizer(((switchToNext) MappingJsonFactory.write(getthis2, R.RemoteActionCompatParcelizer())).getIconCompatParcelizer(), ((isFullscreen) MappingJsonFactory.write(getthis2, setJavaScriptInterface.read())).MediaDescriptionCompat()) : remoteActionCompatParcelizer;
    }

    private final void read() {
        Module module = this.AudioAttributesCompatParcelizer;
        if (module != null) {
            IconCompatParcelizer(module);
        }
        this.AudioAttributesCompatParcelizer = null;
    }

    public /* synthetic */ getThis(inset insetVar, boolean z, float f, MinimalPrettyPrinter minimalPrettyPrinter, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(insetVar, z, f, minimalPrettyPrinter);
    }
}
