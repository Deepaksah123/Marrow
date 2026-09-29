package com.marrow.di.app;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.marrow.TrainingApplication;
import com.marrow.data.models.common.ApplicationData;
import java.io.File;
import java.lang.reflect.Constructor;
import kotlin.BundledChunkExtractor;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaSessionConnectorCustomActionProvider;
import kotlin.Metadata;
import kotlin.getPlanOldPrice;
import kotlin.getStreamPositionUsForContent;
import kotlin.handleMidrowCtrl;
import kotlin.isMiscCode;
import kotlin.parseDuration;
import kotlin.setGateway;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateShuffleButton;
import kotlin.withOriginalAdCount;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/di/app/AppProviderModule;", "", "<init>", "()V", "Lcom/marrow/TrainingApplication;", "p0", "Lcom/marrow/data/models/common/ApplicationData;", "IconCompatParcelizer", "(Lcom/marrow/TrainingApplication;)Lcom/marrow/data/models/common/ApplicationData;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AppProviderModule {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @getPlanOldPrice
    public abstract ApplicationData IconCompatParcelizer(TrainingApplication p0);

    /* JADX INFO: renamed from: com.marrow.di.app.AppProviderModule$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001e\u001a\u00020\u00012\b\b\u0001\u0010\u0005\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/marrow/di/app/AppProviderModule$read;", "", "<init>", "()V", "Landroid/app/Application;", "p0", "Lcom/marrow/TrainingApplication;", "read", "(Landroid/app/Application;)Lcom/marrow/TrainingApplication;", "Landroid/content/Context;", "IconCompatParcelizer", "(Landroid/app/Application;)Landroid/content/Context;", "Lo/handleMidrowCtrl;", "RemoteActionCompatParcelizer", "(Landroid/app/Application;)Lo/handleMidrowCtrl;", "", "AudioAttributesCompatParcelizer", "(Landroid/app/Application;)Ljava/lang/String;", "write", "read$5f34e462", "(Ljava/lang/Object;)Ljava/lang/Object;", "p1", "Ljava/io/File;", "p2", "Lo/withOriginalAdCount;", "p3", "Lo/getStreamPositionUsForContent;", "p4", "Lcom/marrow/data/models/common/ApplicationData;", "p5", "RemoteActionCompatParcelizer$2d3ba20c", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lo/withOriginalAdCount;Lo/getStreamPositionUsForContent;Lcom/marrow/data/models/common/ApplicationData;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getPlanOldPrice
        public final TrainingApplication read(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (TrainingApplication) p0;
        }

        public final Context IconCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0;
        }

        @getPlanOldPrice
        public final handleMidrowCtrl RemoteActionCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new isMiscCode(p0);
        }

        @setGateway(IconCompatParcelizer = "user_agent")
        public final String AudioAttributesCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer3 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            return (String) updateShuffleButton.IconCompatParcelizer(iIconCompatParcelizer2, 1269401153, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer3, -1269401152, new Object[]{p0}, iIconCompatParcelizer);
        }

        @setGateway(IconCompatParcelizer = "deviceid")
        public final String write(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String strAudioAttributesCompatParcelizer = parseDuration.AudioAttributesCompatParcelizer(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return strAudioAttributesCompatParcelizer;
        }

        @getPlanOldPrice
        public final Object read$5f34e462(Object p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                Object[] objArr = {p0};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(365753663);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.lastIndexOf("", '0', 0) + 11351, View.MeasureSpec.getMode(0) + 25, 1803891114, false, null, new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.getCapsMode("", 0, 0) + 11781), 8676 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf("", "", 0) + 14)});
                }
                return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        @getPlanOldPrice
        public final Object RemoteActionCompatParcelizer$2d3ba20c(@setGateway(IconCompatParcelizer = "deviceid") String p0, @setGateway(IconCompatParcelizer = "user_agent") String p1, @setGateway(IconCompatParcelizer = "file_main") File p2, withOriginalAdCount p3, getStreamPositionUsForContent p4, ApplicationData p5) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            toMagicModuleMetaRepoModel.write(p5, "");
            try {
                Object[] objArr = {p0, p2, p1, p3, p4, p5};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1301167441);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.blue(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11234, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -868743622, false, null, new Class[]{String.class, File.class, String.class, withOriginalAdCount.class, BundledChunkExtractor.class, ApplicationData.class});
                }
                return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
