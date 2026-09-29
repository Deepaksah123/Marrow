package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\f\u0010\u0010"}, d2 = {"Lo/modifyReferenceDeserializer;", "Lo/_unwrapAndDeserialize;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Lo/deserializeAndSet;", "Landroid/graphics/Typeface;", "read", "(Lo/deserializeAndSet;)Landroid/graphics/Typeface;", "AudioAttributesCompatParcelizer", "(Lo/deserializeAndSet;Lo/SampleVideos;)Ljava/lang/Object;", "write", "Landroid/content/Context;", "", "Ljava/lang/Object;", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class modifyReferenceDeserializer implements _unwrapAndDeserialize {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Context read;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return modifyReferenceDeserializer.this.AudioAttributesCompatParcelizer(null, this);
        }
    }

    public modifyReferenceDeserializer(Context context) {
        this.read = context.getApplicationContext();
    }

    @Override // kotlin._unwrapAndDeserialize
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final Typeface RemoteActionCompatParcelizer(deserializeAndSet p0) {
        Object obj;
        Typeface typefaceWrite;
        if (p0 instanceof modifyMapDeserializer) {
            modifyMapDeserializer modifymapdeserializer = (modifyMapDeserializer) p0;
            return modifymapdeserializer.getRead().IconCompatParcelizer(this.read, modifymapdeserializer);
        }
        if (!(p0 instanceof DeserializerCache)) {
            return null;
        }
        DeserializerCache deserializerCache = (DeserializerCache) p0;
        int iconCompatParcelizer = deserializerCache.getIconCompatParcelizer();
        if (DataFormatReaders.read(iconCompatParcelizer, DataFormatReaders.INSTANCE.IconCompatParcelizer())) {
            typefaceWrite = updateProperties.write(deserializerCache, this.read);
        } else if (DataFormatReaders.read(iconCompatParcelizer, DataFormatReaders.INSTANCE.RemoteActionCompatParcelizer())) {
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                modifyReferenceDeserializer modifyreferencedeserializer = this;
                obj = C0177getRfBanners.read(updateProperties.write((DeserializerCache) p0, this.read));
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            typefaceWrite = (Typeface) (C0177getRfBanners.RemoteActionCompatParcelizer(obj) ? null : obj);
        } else {
            if (DataFormatReaders.read(iconCompatParcelizer, DataFormatReaders.INSTANCE.write())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            StringBuilder sb = new StringBuilder("Unknown loading type ");
            sb.append((Object) DataFormatReaders.RemoteActionCompatParcelizer(deserializerCache.getIconCompatParcelizer()));
            throw new IllegalArgumentException(sb.toString());
        }
        return createReadableObjectId.IconCompatParcelizer(typefaceWrite, deserializerCache.getRead(), this.read);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin._unwrapAndDeserialize
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.deserializeAndSet r6, kotlin.SampleVideos<? super android.graphics.Typeface> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.modifyReferenceDeserializer.read
            if (r0 == 0) goto L14
            r0 = r7
            o.modifyReferenceDeserializer$read r0 = (o.modifyReferenceDeserializer.read) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.RemoteActionCompatParcelizer
            int r7 = r7 + r2
            r0.RemoteActionCompatParcelizer = r7
            goto L19
        L14:
            o.modifyReferenceDeserializer$read r0 = new o.modifyReferenceDeserializer$read
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.IconCompatParcelizer
            o.deserializeAndSet r6 = (kotlin.deserializeAndSet) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L69
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            return r7
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            boolean r7 = r6 instanceof kotlin.modifyMapDeserializer
            if (r7 == 0) goto L55
            o.modifyMapDeserializer r6 = (kotlin.modifyMapDeserializer) r6
            o.modifyMapDeserializer$IconCompatParcelizer r7 = r6.getRead()
            android.content.Context r5 = r5.read
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r5 = r7.IconCompatParcelizer(r5, r6, r0)
            if (r5 == r1) goto L68
            return r5
        L55:
            boolean r7 = r6 instanceof kotlin.DeserializerCache
            if (r7 == 0) goto L78
            r7 = r6
            o.DeserializerCache r7 = (kotlin.DeserializerCache) r7
            android.content.Context r2 = r5.read
            r0.IconCompatParcelizer = r6
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r7 = kotlin.updateProperties.IconCompatParcelizer(r7, r2, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            o.DeserializerCache r6 = (kotlin.DeserializerCache) r6
            o.getReader$read r6 = r6.getRead()
            android.content.Context r5 = r5.read
            android.graphics.Typeface r5 = kotlin.createReadableObjectId.IconCompatParcelizer(r7, r6, r5)
            return r5
        L78:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unknown font type: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.modifyReferenceDeserializer.AudioAttributesCompatParcelizer(o.deserializeAndSet, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin._unwrapAndDeserialize
    /* JADX INFO: renamed from: write, reason: from getter */
    public final Object getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
