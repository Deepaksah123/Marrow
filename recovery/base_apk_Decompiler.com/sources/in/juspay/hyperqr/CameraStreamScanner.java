package in.juspay.hyperqr;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.util.concurrent.ListenableFuture;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.core.JuspayLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Mp4ExtractorExternalSyntheticLambda0;
import kotlin._isNaN;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.hasGetter;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u000bJ\b\u0010\u0018\u001a\u00020\u000bH\u0002R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lin/juspay/hyperqr/CameraStreamScanner;", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "owner", "Landroidx/lifecycle/LifecycleOwner;", LogCategory.CONTEXT, "Landroid/content/Context;", "callback", "Lkotlin/Function1;", "", "", "(Landroid/view/ViewGroup;Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "previewView", "Landroidx/camera/view/PreviewView;", "relativeLayout", "Landroid/widget/RelativeLayout;", "createUI", "releaseCameraResources", "scanWithCamera", "startCamera", "hyper-qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CameraStreamScanner {
    private final getAnswerMap<String, getShowPopup> callback;
    private ExecutorService cameraExecutor;
    private ProcessCameraProvider cameraProvider;
    private final ViewGroup container;
    private final Context context;
    private final hasGetter owner;
    private PreviewView previewView;
    private RelativeLayout relativeLayout;

    /* JADX WARN: Multi-variable type inference failed */
    public CameraStreamScanner(ViewGroup viewGroup, hasGetter hasgetter, Context context, getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.container = viewGroup;
        this.owner = hasgetter;
        this.context = context;
        this.callback = getanswermap;
    }

    public final void scanWithCamera() {
        try {
            createUI();
            startCamera();
        } catch (Exception e) {
            JuspayLogger.e("FirebaseQrScanner", "setting ui and starting camera failed", e);
            releaseCameraResources();
        }
    }

    private final void createUI() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(executorServiceNewSingleThreadExecutor, "");
        this.cameraExecutor = executorServiceNewSingleThreadExecutor;
        RelativeLayout relativeLayout = new RelativeLayout(this.context);
        this.relativeLayout = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PreviewView previewView = new PreviewView(this.context);
        previewView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        previewView.setVisibility(0);
        this.previewView = previewView;
        previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        ViewGroup viewGroup = this.container;
        RelativeLayout relativeLayout2 = this.relativeLayout;
        if (relativeLayout2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            relativeLayout2 = null;
        }
        viewGroup.addView(relativeLayout2);
    }

    private final void startCamera() {
        final ListenableFuture processCameraProvider = ProcessCameraProvider.getInstance(this.context);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(processCameraProvider, "");
        processCameraProvider.IconCompatParcelizer(new Runnable() { // from class: in.juspay.hyperqr.CameraStreamScanner$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraStreamScanner.startCamera$lambda$3(this.f$0, processCameraProvider);
            }
        }, _isNaN.getMainExecutor(this.context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCamera$lambda$3(CameraStreamScanner cameraStreamScanner, Mp4ExtractorExternalSyntheticLambda0 mp4ExtractorExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(cameraStreamScanner, "");
        toMagicModuleMetaRepoModel.write(mp4ExtractorExternalSyntheticLambda0, "");
        V v = mp4ExtractorExternalSyntheticLambda0.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(v, "");
        cameraStreamScanner.cameraProvider = (ProcessCameraProvider) v;
        UseCase useCaseBuild = new Preview.Builder().build();
        PreviewView previewView = cameraStreamScanner.previewView;
        PreviewView previewView2 = null;
        if (previewView == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            previewView = null;
        }
        useCaseBuild.setSurfaceProvider(previewView.getSurfaceProvider());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(useCaseBuild, "");
        UseCase useCaseBuild2 = new ImageAnalysis.Builder().setTargetResolution(new Size(2560, 1440)).setBackpressureStrategy(0).build();
        QRCodeAnalyzer qRCodeAnalyzer = new QRCodeAnalyzer(new CameraStreamScanner$startCamera$1$imageAnalyzer$1$analyzer$1(cameraStreamScanner));
        ExecutorService executorService = cameraStreamScanner.cameraExecutor;
        if (executorService == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            executorService = null;
        }
        useCaseBuild2.setAnalyzer(executorService, qRCodeAnalyzer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(useCaseBuild2, "");
        CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cameraSelector, "");
        try {
            ProcessCameraProvider processCameraProvider = cameraStreamScanner.cameraProvider;
            if (processCameraProvider == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                processCameraProvider = null;
            }
            processCameraProvider.unbindAll();
            ProcessCameraProvider processCameraProvider2 = cameraStreamScanner.cameraProvider;
            if (processCameraProvider2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                processCameraProvider2 = null;
            }
            processCameraProvider2.bindToLifecycle(cameraStreamScanner.owner, cameraSelector, new UseCase[]{useCaseBuild, useCaseBuild2});
            RelativeLayout relativeLayout = cameraStreamScanner.relativeLayout;
            if (relativeLayout == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                relativeLayout = null;
            }
            PreviewView previewView3 = cameraStreamScanner.previewView;
            if (previewView3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                previewView2 = previewView3;
            }
            relativeLayout.addView((View) previewView2, 0);
        } catch (Exception e) {
            JuspayLogger.e("FirebaseQrScanner", "camera binding failed", e);
        }
    }

    public final void releaseCameraResources() {
        try {
            ProcessCameraProvider processCameraProvider = this.cameraProvider;
            ExecutorService executorService = null;
            if (processCameraProvider == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                processCameraProvider = null;
            }
            processCameraProvider.unbindAll();
            ExecutorService executorService2 = this.cameraExecutor;
            if (executorService2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                executorService = executorService2;
            }
            executorService.shutdown();
        } catch (Exception e) {
            JuspayLogger.e("FirebaseQrScanner", "camera resource release failed", e);
        }
    }
}
