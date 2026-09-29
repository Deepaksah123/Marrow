package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BitmapLoader;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import kotlin.AtomParsersChunkIterator;
import kotlin.Mp4ExtractorExternalSyntheticLambda0;
import kotlin.buildPsshAtom;
import kotlin.parseUdtaMeta;
import kotlin.updateSampleIndex;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final parseUdtaMeta<updateSampleIndex> DEFAULT_EXECUTOR_SERVICE = AtomParsersChunkIterator.read(new parseUdtaMeta() { // from class: com.google.android.exoplayer2.upstream.DataSourceBitmapLoader$$ExternalSyntheticLambda0
        @Override // kotlin.parseUdtaMeta
        public final Object get() {
            return buildPsshAtom.RemoteActionCompatParcelizer(Executors.newSingleThreadExecutor());
        }
    });
    private final DataSource.Factory dataSourceFactory;
    private final updateSampleIndex listeningExecutorService;

    public DataSourceBitmapLoader(Context context) {
        this((updateSampleIndex) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    public DataSourceBitmapLoader(updateSampleIndex updatesampleindex, DataSource.Factory factory) {
        this.listeningExecutorService = updatesampleindex;
        this.dataSourceFactory = factory;
    }

    @Override // com.google.android.exoplayer2.util.BitmapLoader
    public final Mp4ExtractorExternalSyntheticLambda0<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: com.google.android.exoplayer2.upstream.DataSourceBitmapLoader$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DataSourceBitmapLoader.decode(bArr);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadBitmap$2$com-google-android-exoplayer2-upstream-DataSourceBitmapLoader, reason: not valid java name */
    final /* synthetic */ Bitmap m158lambda$loadBitmap$2$comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader(Uri uri) throws Exception {
        return load(this.dataSourceFactory.createDataSource(), uri);
    }

    @Override // com.google.android.exoplayer2.util.BitmapLoader
    public final Mp4ExtractorExternalSyntheticLambda0<Bitmap> loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: com.google.android.exoplayer2.upstream.DataSourceBitmapLoader$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m158lambda$loadBitmap$2$comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader(uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Assertions.checkArgument(bitmapDecodeByteArray != null, "Could not decode image data");
        return bitmapDecodeByteArray;
    }

    private static Bitmap load(DataSource dataSource, Uri uri) throws IOException {
        dataSource.open(new DataSpec(uri));
        return decode(DataSourceUtil.readToEnd(dataSource));
    }
}
