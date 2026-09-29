package kotlin;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin._hasTypeResolver;
import kotlin.reportInvalidBaseType;

/* JADX INFO: renamed from: o.subTypeValidator, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0209subTypeValidator implements _hasTypeResolver {
    private _hasTypeResolver AudioAttributesCompatParcelizer;
    private _hasTypeResolver AudioAttributesImplApi21Parcelizer;
    private _hasTypeResolver AudioAttributesImplApi26Parcelizer;
    private final List<TypeNameIdResolver> AudioAttributesImplBaseParcelizer = new ArrayList();
    private _hasTypeResolver IconCompatParcelizer;
    private _hasTypeResolver MediaBrowserCompatCustomActionResultReceiver;
    private _hasTypeResolver MediaBrowserCompatItemReceiver;
    private _hasTypeResolver MediaBrowserCompatSearchResultReceiver;
    private _hasTypeResolver RemoteActionCompatParcelizer;
    private final _hasTypeResolver read;
    private final Context write;

    /* JADX INFO: renamed from: o.subTypeValidator$RemoteActionCompatParcelizer */
    public static final class RemoteActionCompatParcelizer implements _hasTypeResolver.write {
        private final Context RemoteActionCompatParcelizer;
        private TypeNameIdResolver read;
        private final _hasTypeResolver.write write;

        public RemoteActionCompatParcelizer(Context context) {
            this(context, new reportInvalidBaseType.IconCompatParcelizer());
        }

        public RemoteActionCompatParcelizer(Context context, _hasTypeResolver.write writeVar) {
            this.RemoteActionCompatParcelizer = context.getApplicationContext();
            this.write = writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o._hasTypeResolver.write
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public C0209subTypeValidator write() {
            return new C0209subTypeValidator(this.RemoteActionCompatParcelizer, this.write.write());
        }
    }

    public C0209subTypeValidator(Context context, _hasTypeResolver _hastyperesolver) {
        this.write = context.getApplicationContext();
        this.read = (_hasTypeResolver) buildTypeSerializer.IconCompatParcelizer(_hastyperesolver);
    }

    @Override // kotlin._hasTypeResolver
    public final void read(TypeNameIdResolver typeNameIdResolver) {
        this.read.read(typeNameIdResolver);
        this.AudioAttributesImplBaseParcelizer.add(typeNameIdResolver);
        read(this.AudioAttributesImplApi21Parcelizer, typeNameIdResolver);
        read(this.AudioAttributesCompatParcelizer, typeNameIdResolver);
        read(this.RemoteActionCompatParcelizer, typeNameIdResolver);
        read(this.MediaBrowserCompatItemReceiver, typeNameIdResolver);
        read(this.MediaBrowserCompatSearchResultReceiver, typeNameIdResolver);
        read(this.IconCompatParcelizer, typeNameIdResolver);
        read(this.MediaBrowserCompatCustomActionResultReceiver, typeNameIdResolver);
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws IOException {
        buildTypeSerializer.write(this.AudioAttributesImplApi26Parcelizer == null);
        String scheme = subTypeValidator.AudioAttributesImplBaseParcelizer.getScheme();
        if (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(subTypeValidator.AudioAttributesImplBaseParcelizer)) {
            String path = subTypeValidator.AudioAttributesImplBaseParcelizer.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.AudioAttributesImplApi26Parcelizer = write();
            } else {
                this.AudioAttributesImplApi26Parcelizer = MediaBrowserCompatItemReceiver();
            }
        } else if ("asset".equals(scheme)) {
            this.AudioAttributesImplApi26Parcelizer = write();
        } else if ("content".equals(scheme)) {
            this.AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer();
        } else if ("rtmp".equals(scheme)) {
            this.AudioAttributesImplApi26Parcelizer = AudioAttributesImplBaseParcelizer();
        } else if ("udp".equals(scheme)) {
            this.AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        } else if ("data".equals(scheme)) {
            this.AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi21Parcelizer();
        } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
            this.AudioAttributesImplApi26Parcelizer = MediaBrowserCompatCustomActionResultReceiver();
        } else {
            this.AudioAttributesImplApi26Parcelizer = this.read;
        }
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(subTypeValidator);
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        return ((_hasTypeResolver) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)).AudioAttributesCompatParcelizer(bArr, i, i2);
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        _hasTypeResolver _hastyperesolver = this.AudioAttributesImplApi26Parcelizer;
        if (_hastyperesolver == null) {
            return null;
        }
        return _hastyperesolver.IconCompatParcelizer();
    }

    @Override // kotlin._hasTypeResolver
    public final Map<String, List<String>> read() {
        _hasTypeResolver _hastyperesolver = this.AudioAttributesImplApi26Parcelizer;
        return _hastyperesolver == null ? Collections.emptyMap() : _hastyperesolver.read();
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws IOException {
        _hasTypeResolver _hastyperesolver = this.AudioAttributesImplApi26Parcelizer;
        if (_hastyperesolver != null) {
            try {
                _hastyperesolver.AudioAttributesCompatParcelizer();
            } finally {
                this.AudioAttributesImplApi26Parcelizer = null;
            }
        }
    }

    private _hasTypeResolver AudioAttributesImplApi26Parcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            baseType basetype = new baseType();
            this.MediaBrowserCompatSearchResultReceiver = basetype;
            AudioAttributesCompatParcelizer(basetype);
        }
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    private _hasTypeResolver MediaBrowserCompatItemReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            TypeDeserializerBase typeDeserializerBase = new TypeDeserializerBase();
            this.AudioAttributesImplApi21Parcelizer = typeDeserializerBase;
            AudioAttributesCompatParcelizer(typeDeserializerBase);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private _hasTypeResolver write() {
        if (this.AudioAttributesCompatParcelizer == null) {
            _combineNamedAndUnnamed _combinenamedandunnamed = new _combineNamedAndUnnamed(this.write);
            this.AudioAttributesCompatParcelizer = _combinenamedandunnamed;
            AudioAttributesCompatParcelizer(_combinenamedandunnamed);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    private _hasTypeResolver RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            _strictTypeIdHandling _stricttypeidhandling = new _strictTypeIdHandling(this.write);
            this.RemoteActionCompatParcelizer = _stricttypeidhandling;
            AudioAttributesCompatParcelizer(_stricttypeidhandling);
        }
        return this.RemoteActionCompatParcelizer;
    }

    private _hasTypeResolver AudioAttributesImplBaseParcelizer() {
        if (this.MediaBrowserCompatItemReceiver == null) {
            try {
                _hasTypeResolver _hastyperesolver = (_hasTypeResolver) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.MediaBrowserCompatItemReceiver = _hastyperesolver;
                AudioAttributesCompatParcelizer(_hastyperesolver);
            } catch (ClassNotFoundException unused) {
                prune.RemoteActionCompatParcelizer("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.MediaBrowserCompatItemReceiver == null) {
                this.MediaBrowserCompatItemReceiver = this.read;
            }
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    private _hasTypeResolver AudioAttributesImplApi21Parcelizer() {
        if (this.IconCompatParcelizer == null) {
            allowPrimitiveTypes allowprimitivetypes = new allowPrimitiveTypes();
            this.IconCompatParcelizer = allowprimitivetypes;
            AudioAttributesCompatParcelizer(allowprimitivetypes);
        }
        return this.IconCompatParcelizer;
    }

    private _hasTypeResolver MediaBrowserCompatCustomActionResultReceiver() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            TypeIdResolverBase typeIdResolverBase = new TypeIdResolverBase(this.write);
            this.MediaBrowserCompatCustomActionResultReceiver = typeIdResolverBase;
            AudioAttributesCompatParcelizer(typeIdResolverBase);
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private void AudioAttributesCompatParcelizer(_hasTypeResolver _hastyperesolver) {
        for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.size(); i++) {
            _hastyperesolver.read(this.AudioAttributesImplBaseParcelizer.get(i));
        }
    }

    private static void read(_hasTypeResolver _hastyperesolver, TypeNameIdResolver typeNameIdResolver) {
        if (_hastyperesolver != null) {
            _hastyperesolver.read(typeNameIdResolver);
        }
    }
}
