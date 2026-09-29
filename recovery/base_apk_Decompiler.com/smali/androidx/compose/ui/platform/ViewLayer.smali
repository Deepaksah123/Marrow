###### Class androidx.compose.ui.platform.ViewLayer (androidx.compose.ui.platform.ViewLayer)
.class public final Landroidx/compose/ui/platform/ViewLayer;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lo/_reportUnkownFormat;
.implements Lo/getGenericSignature;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/ViewLayer$write;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0018J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00192\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008 \u0010\u0013J7\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0014\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0013J\u000f\u0010\'\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u0013J\u000f\u0010(\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008(\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0007\u0010)J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010+J9\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00060,2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060-H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010.J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020/H\u0016\u00a2\u0006\u0004\u0008\u0010\u00100J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020/H\u0016\u00a2\u0006\u0004\u0008\u0007\u00100R\u0011\u00104\u001a\u0002018\u0006\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0011\u0010\u0010\u001a\u0002058\u0006\u00a2\u0006\u0006\n\u0004\u00086\u00107R,\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0006\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u00108R\u001e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010\u0018\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0016\u0010@\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010D8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010ER*\u0010G\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u000c8\u0007@CX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010?\u001a\u0004\u0008G\u0010\u000e\"\u0004\u0008\u0007\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0016\u00106\u001a\u00020\u000c8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010?R\u0014\u0010>\u001a\u00020L8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010MR\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00010N8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010\u0014\u001a\u00020/8WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u0010QR\"\u0010S\u001a\u00020R8\u0017@\u0017X\u0097\u000e\u00a2\u0006\u0012\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR\"\u0010Y\u001a\u00020\u000c8\u0017@\u0017X\u0097\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010?\u001a\u0004\u0008Y\u0010\u000e\"\u0004\u0008Z\u0010HR\u0016\u0010\u0012\u001a\u00020[8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0016\u0010I\u001a\u00020\u000c8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008^\u0010?R$\u0010a\u001a\u00020R2\u0006\u0010\u0005\u001a\u00020R8G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008_\u0010V\"\u0004\u0008`\u0010XR\u0016\u0010^\u001a\u00020!8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008b\u0010c"
    }
    d2 = {
        "Landroidx/compose/ui/platform/ViewLayer;",
        "Landroid/view/View;",
        "Lo/_reportUnkownFormat;",
        "Lo/getGenericSignature;",
        "Lo/resolveAbstractType;",
        "p0",
        "",
        "IconCompatParcelizer",
        "(Lo/resolveAbstractType;)V",
        "Lo/releaseBuffers;",
        "MediaBrowserCompatCustomActionResultReceiver",
        "()Lo/releaseBuffers;",
        "",
        "hasOverlappingRendering",
        "()Z",
        "Lo/getReferencedType;",
        "RemoteActionCompatParcelizer",
        "(J)Z",
        "RatingCompat",
        "()V",
        "MediaBrowserCompatSearchResultReceiver",
        "Lo/getKey;",
        "(J)V",
        "Lo/hasReferringProperties;",
        "write",
        "Lo/JsonParserDelegate;",
        "Lo/hasAnyGetter;",
        "p1",
        "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V",
        "Landroid/graphics/Canvas;",
        "dispatchDraw",
        "(Landroid/graphics/Canvas;)V",
        "invalidate",
        "",
        "p2",
        "p3",
        "p4",
        "onLayout",
        "(ZIIII)V",
        "AudioAttributesCompatParcelizer",
        "forceLayout",
        "(JZ)J",
        "Lo/getType;",
        "(Lo/getType;Z)V",
        "Lkotlin/Function2;",
        "Lkotlin/Function0;",
        "(Lo/MagicModuleSubmissionRequestBody;Lo/getCreatedOnDateMs;)V",
        "Lo/resetWithShared;",
        "([F)V",
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "onFastForward",
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "read",
        "Landroidx/compose/ui/platform/DrawChildContainer;",
        "MediaDescriptionCompat",
        "Landroidx/compose/ui/platform/DrawChildContainer;",
        "Lo/MagicModuleSubmissionRequestBody;",
        "MediaMetadataCompat",
        "Lo/getCreatedOnDateMs;",
        "Lo/JsonSerialize;",
        "onPlayFromMediaId",
        "Lo/JsonSerialize;",
        "MediaBrowserCompatMediaItem",
        "Z",
        "AudioAttributesImplBaseParcelizer",
        "Landroid/graphics/Rect;",
        "MediaBrowserCompatItemReceiver",
        "Landroid/graphics/Rect;",
        "Lo/removeSoftRefsClearedByGc;",
        "()Lo/removeSoftRefsClearedByGc;",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "AudioAttributesImplApi26Parcelizer",
        "(Z)V",
        "onAddQueueItem",
        "Lo/releaseBuffers;",
        "AudioAttributesImplApi21Parcelizer",
        "Lo/createFlattened;",
        "Lo/createFlattened;",
        "Lo/contentAs;",
        "handleMediaPlayPauseIfPendingOnHandler",
        "Lo/contentAs;",
        "()[F",
        "",
        "frameRate",
        "F",
        "getFrameRate",
        "()F",
        "setFrameRate",
        "(F)V",
        "isFrameRateFromParent",
        "setFrameRateFromParent",
        "Lo/findCreatorAnnotation;",
        "onCustomAction",
        "J",
        "onCommand",
        "getCameraDistancePx",
        "setCameraDistancePx",
        "cameraDistancePx",
        "onPause",
        "I"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static AudioAttributesCompatParcelizer:Z

.field private static AudioAttributesImplApi21Parcelizer:Ljava/lang/reflect/Method;

.field private static AudioAttributesImplBaseParcelizer:Ljava/lang/reflect/Field;

.field private static final IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

.field private static MediaBrowserCompatCustomActionResultReceiver:Z

.field private static final RemoteActionCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/MagicModuleSubmissionRequestBody<",
            "Landroid/view/View;",
            "Landroid/graphics/Matrix;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field public static final read:I

.field public static final write:Landroidx/compose/ui/platform/ViewLayer$write;


# instance fields
.field private final AudioAttributesImplApi26Parcelizer:Lo/createFlattened;

.field private MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

.field private MediaBrowserCompatMediaItem:Z

.field private MediaBrowserCompatSearchResultReceiver:Lo/MagicModuleSubmissionRequestBody;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/MagicModuleSubmissionRequestBody<",
            "-",
            "Lo/JsonParserDelegate;",
            "-",
            "Lo/hasAnyGetter;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private final MediaDescriptionCompat:Landroidx/compose/ui/platform/DrawChildContainer;

.field private MediaMetadataCompat:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private RatingCompat:Z

.field private frameRate:F

.field private final handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/contentAs<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private isFrameRateFromParent:Z

.field private onAddQueueItem:Lo/releaseBuffers;

.field private onCommand:Z

.field private onCustomAction:J

.field private final onFastForward:Landroidx/compose/ui/platform/AndroidComposeView;

.field private onPause:I

.field private final onPlayFromMediaId:Lo/JsonSerialize;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/ui/platform/ViewLayer$write;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/ViewLayer$write;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/ui/platform/ViewLayer;->write:Landroidx/compose/ui/platform/ViewLayer$write;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/ViewLayer;->read:I

    .line 447
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer$5;->write:Landroidx/compose/ui/platform/ViewLayer$5;

    check-cast v0, Lo/MagicModuleSubmissionRequestBody;

    sput-object v0, Landroidx/compose/ui/platform/ViewLayer;->RemoteActionCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

    .line 453
    new-instance v0, Landroidx/compose/ui/platform/ViewLayer$read;

    invoke-direct {v0}, Landroidx/compose/ui/platform/ViewLayer$read;-><init>()V

    check-cast v0, Landroid/view/ViewOutlineProvider;

    sput-object v0, Landroidx/compose/ui/platform/ViewLayer;->IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

    return-void
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Landroidx/compose/ui/platform/ViewLayer;)Lo/JsonSerialize;
    .registers 1

    .line 47
    iget-object p0, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    return-object p0
.end method

.method public static final synthetic AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    .line 47
    sget-boolean v0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatCustomActionResultReceiver:Z

    return v0
.end method

.method public static final synthetic AudioAttributesImplBaseParcelizer()Ljava/lang/reflect/Method;
    .registers 1

    .line 47
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplApi21Parcelizer:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method private final IconCompatParcelizer(Z)V
    .registers 3

    .line 71
    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eq p1, v0, :cond_d

    .line 72
    iput-boolean p1, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    .line 73
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->onFastForward:Landroidx/compose/ui/platform/AndroidComposeView;

    check-cast p0, Lo/_reportUnkownFormat;

    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->RemoteActionCompatParcelizer(Lo/_reportUnkownFormat;Z)V

    :cond_d
    return-void
.end method

.method private final MediaBrowserCompatCustomActionResultReceiver()Lo/releaseBuffers;
    .registers 2

    .line 266
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->onAddQueueItem:Lo/releaseBuffers;

    if-nez v0, :cond_a

    invoke-static {}, Lo/fromInitial;->AudioAttributesCompatParcelizer()Lo/releaseBuffers;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->onAddQueueItem:Lo/releaseBuffers;

    :cond_a
    return-object v0
.end method

.method private final MediaBrowserCompatItemReceiver()Lo/removeSoftRefsClearedByGc;
    .registers 2

    .line 63
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    invoke-virtual {v0}, Lo/JsonSerialize;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-nez v0, :cond_15

    .line 66
    iget-object p0, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    invoke-virtual {p0}, Lo/JsonSerialize;->read()Lo/removeSoftRefsClearedByGc;

    move-result-object p0

    return-object p0

    :cond_15
    const/4 p0, 0x0

    return-object p0
.end method

.method private final MediaBrowserCompatSearchResultReceiver()V
    .registers 5

    .line 297
    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_2a

    .line 298
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    const/4 v1, 0x0

    if-nez v0, :cond_19

    .line 299
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    goto :goto_27

    .line 301
    :cond_19
    invoke-static {v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 303
    :goto_27
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    goto :goto_2b

    :cond_2a
    const/4 v0, 0x0

    .line 296
    :goto_2b
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method private final RatingCompat()V
    .registers 2

    .line 288
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    invoke-virtual {v0}, Lo/JsonSerialize;->IconCompatParcelizer()Landroid/graphics/Outline;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 289
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    .line 287
    :goto_c
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    return-void
.end method

.method public static final synthetic RemoteActionCompatParcelizer()Z
    .registers 1

    .line 47
    sget-boolean v0, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesCompatParcelizer:Z

    return v0
.end method

.method public static final synthetic read(Ljava/lang/reflect/Field;)V
    .registers 1

    .line 47
    sput-object p0, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplBaseParcelizer:Ljava/lang/reflect/Field;

    return-void
.end method

.method public static final synthetic read(Z)V
    .registers 1

    .line 47
    sput-boolean p0, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method public static final synthetic write()Ljava/lang/reflect/Field;
    .registers 1

    .line 47
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplBaseParcelizer:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public static final synthetic write(Ljava/lang/reflect/Method;)V
    .registers 1

    .line 47
    sput-object p0, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplApi21Parcelizer:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final synthetic write(Z)V
    .registers 1

    .line 47
    sput-boolean p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 390
    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v0, :cond_14

    sget-boolean v0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez v0, :cond_14

    .line 391
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->write:Landroidx/compose/ui/platform/ViewLayer$write;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/ViewLayer$write;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 392
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->IconCompatParcelizer(Z)V

    :cond_14
    return-void
.end method

.method public final AudioAttributesImplApi26Parcelizer()Z
    .registers 1

    .line 69
    iget-boolean p0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    return p0
.end method

.method public final IconCompatParcelizer(JZ)J
    .registers 4

    if-eqz p3, :cond_9

    .line 403
    iget-object p3, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {p3, p0, p1, p2}, Lo/contentAs;->write(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0

    .line 405
    :cond_9
    iget-object p3, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {p3, p0, p1, p2}, Lo/contentAs;->AudioAttributesCompatParcelizer(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public final IconCompatParcelizer()V
    .registers 3

    const/4 v0, 0x0

    .line 375
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->IconCompatParcelizer(Z)V

    .line 376
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->onFastForward:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->ResultReceiver()V

    const/4 v0, 0x0

    .line 377
    iput-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatSearchResultReceiver:Lo/MagicModuleSubmissionRequestBody;

    .line 378
    iput-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaMetadataCompat:Lo/getCreatedOnDateMs;

    .line 380
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->onFastForward:Landroidx/compose/ui/platform/AndroidComposeView;

    move-object v1, p0

    check-cast v1, Lo/_reportUnkownFormat;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->IconCompatParcelizer(Lo/_reportUnkownFormat;)Z

    .line 383
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaDescriptionCompat:Landroidx/compose/ui/platform/DrawChildContainer;

    check-cast p0, Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public final IconCompatParcelizer(J)V
    .registers 6

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    long-to-int p1, p1

    .line 312
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    if-ne v0, p2, :cond_13

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    if-ne p1, p2, :cond_13

    return-void

    .line 313
    :cond_13
    iget-wide v1, p0, Landroidx/compose/ui/platform/ViewLayer;->onCustomAction:J

    invoke-static {v1, v2}, Lo/findCreatorAnnotation;->read(J)F

    move-result p2

    int-to-float v1, v0

    mul-float/2addr p2, v1

    invoke-virtual {p0, p2}, Landroidx/compose/ui/platform/ViewLayer;->setPivotX(F)V

    .line 314
    iget-wide v1, p0, Landroidx/compose/ui/platform/ViewLayer;->onCustomAction:J

    invoke-static {v1, v2}, Lo/findCreatorAnnotation;->write(J)F

    move-result p2

    int-to-float v1, p1

    mul-float/2addr p2, v1

    invoke-virtual {p0, p2}, Landroidx/compose/ui/platform/ViewLayer;->setPivotY(F)V

    .line 315
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->RatingCompat()V

    .line 316
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0, p2, v1, v2, v0}, Landroid/view/View;->layout(IIII)V

    .line 317
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatSearchResultReceiver()V

    .line 318
    iget-object p0, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {p0}, Lo/contentAs;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final IconCompatParcelizer(Lo/MagicModuleSubmissionRequestBody;Lo/getCreatedOnDateMs;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/MagicModuleSubmissionRequestBody<",
            "-",
            "Lo/JsonParserDelegate;",
            "-",
            "Lo/hasAnyGetter;",
            "Lo/getShowPopup;",
            ">;",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 422
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaDescriptionCompat:Landroidx/compose/ui/platform/DrawChildContainer;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 426
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {v0}, Lo/contentAs;->IconCompatParcelizer()V

    const/4 v0, 0x0

    .line 427
    iput-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatMediaItem:Z

    .line 428
    iput-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->RatingCompat:Z

    .line 429
    sget-object v1, Lo/findCreatorAnnotation;->IconCompatParcelizer:Lo/findCreatorAnnotation$IconCompatParcelizer;

    invoke-virtual {v1}, Lo/findCreatorAnnotation$IconCompatParcelizer;->AudioAttributesCompatParcelizer()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/ViewLayer;->onCustomAction:J

    .line 430
    iput-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatSearchResultReceiver:Lo/MagicModuleSubmissionRequestBody;

    .line 431
    iput-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaMetadataCompat:Lo/getCreatedOnDateMs;

    .line 432
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->IconCompatParcelizer(Z)V

    return-void
.end method

.method public final IconCompatParcelizer(Lo/resolveAbstractType;)V
    .registers 15

    .line 139
    invoke-virtual {p1}, Lo/resolveAbstractType;->onMediaButtonEvent()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/platform/ViewLayer;->onPause:I

    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_2d

    .line 141
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaBrowserCompatItemReceiver()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/ViewLayer;->onCustomAction:J

    .line 142
    invoke-static {v1, v2}, Lo/findCreatorAnnotation;->read(J)F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setPivotX(F)V

    .line 143
    iget-wide v1, p0, Landroidx/compose/ui/platform/ViewLayer;->onCustomAction:J

    invoke-static {v1, v2}, Lo/findCreatorAnnotation;->write(J)F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setPivotY(F)V

    :cond_2d
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_38

    .line 146
    invoke-virtual {p1}, Lo/resolveAbstractType;->AudioAttributesImplApi21Parcelizer()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setScaleX(F)V

    :cond_38
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_43

    .line 149
    invoke-virtual {p1}, Lo/resolveAbstractType;->AudioAttributesImplApi26Parcelizer()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setScaleY(F)V

    :cond_43
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_4e

    .line 152
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaMetadataCompat()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setAlpha(F)V

    :cond_4e
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_59

    .line 155
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaBrowserCompatMediaItem()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setTranslationX(F)V

    :cond_59
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_64

    .line 158
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaBrowserCompatSearchResultReceiver()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setTranslationY(F)V

    :cond_64
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_6f

    .line 161
    invoke-virtual {p1}, Lo/resolveAbstractType;->onFastForward()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setElevation(F)V

    :cond_6f
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7a

    .line 164
    invoke-virtual {p1}, Lo/resolveAbstractType;->AudioAttributesImplBaseParcelizer()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setRotation(F)V

    :cond_7a
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_85

    .line 167
    invoke-virtual {p1}, Lo/resolveAbstractType;->RemoteActionCompatParcelizer()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setRotationX(F)V

    :cond_85
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_90

    .line 170
    invoke-virtual {p1}, Lo/resolveAbstractType;->read()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setRotationY(F)V

    :cond_90
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9b

    .line 173
    invoke-virtual {p1}, Lo/resolveAbstractType;->write()F

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/ViewLayer;->setCameraDistancePx(F)V

    .line 175
    :cond_9b
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatItemReceiver()Lo/removeSoftRefsClearedByGc;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_a5

    move v1, v2

    goto :goto_a6

    :cond_a5
    move v1, v3

    .line 176
    :goto_a6
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v4

    if-eqz v4, :cond_b8

    invoke-virtual {p1}, Lo/resolveAbstractType;->onPlay()Lo/findAndAddVirtualProperties;

    move-result-object v4

    invoke-static {}, Lo/parseVersion;->read()Lo/findAndAddVirtualProperties;

    move-result-object v5

    if-eq v4, v5, :cond_b8

    move v9, v2

    goto :goto_b9

    :cond_b8
    move v9, v3

    :goto_b9
    and-int/lit16 v4, v0, 0x6000

    if-eqz v4, :cond_d8

    .line 178
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v4

    if-eqz v4, :cond_cf

    invoke-virtual {p1}, Lo/resolveAbstractType;->onPlay()Lo/findAndAddVirtualProperties;

    move-result-object v4

    invoke-static {}, Lo/parseVersion;->read()Lo/findAndAddVirtualProperties;

    move-result-object v5

    if-ne v4, v5, :cond_cf

    move v4, v2

    goto :goto_d0

    :cond_cf
    move v4, v3

    :goto_d0
    iput-boolean v4, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatMediaItem:Z

    .line 179
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatSearchResultReceiver()V

    .line 180
    invoke-virtual {p0, v9}, Landroidx/compose/ui/platform/ViewLayer;->setClipToOutline(Z)V

    .line 183
    :cond_d8
    iget-object v6, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    .line 184
    invoke-virtual {p1}, Lo/resolveAbstractType;->onPlayFromMediaId()Lo/resetWithString;

    move-result-object v7

    .line 185
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaMetadataCompat()F

    move-result v8

    .line 187
    invoke-virtual {p1}, Lo/resolveAbstractType;->onFastForward()F

    move-result v10

    .line 188
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaBrowserCompatCustomActionResultReceiver()J

    move-result-wide v11

    .line 183
    invoke-virtual/range {v6 .. v12}, Lo/JsonSerialize;->read(Lo/resetWithString;FZFJ)Z

    move-result v4

    .line 190
    iget-object v5, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    invoke-virtual {v5}, Lo/JsonSerialize;->RemoteActionCompatParcelizer()Z

    move-result v5

    if-eqz v5, :cond_f9

    .line 191
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->RatingCompat()V

    .line 193
    :cond_f9
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatItemReceiver()Lo/removeSoftRefsClearedByGc;

    move-result-object v5

    if-eqz v5, :cond_101

    move v5, v2

    goto :goto_102

    :cond_101
    move v5, v3

    :goto_102
    if-ne v1, v5, :cond_108

    if-eqz v5, :cond_10b

    if-eqz v4, :cond_10b

    .line 195
    :cond_108
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 197
    :cond_10b
    iget-boolean v1, p0, Landroidx/compose/ui/platform/ViewLayer;->RatingCompat:Z

    if-nez v1, :cond_11f

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->getElevation()F

    move-result v1

    const/4 v4, 0x0

    cmpl-float v1, v1, v4

    if-lez v1, :cond_11f

    .line 198
    iget-object v1, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaMetadataCompat:Lo/getCreatedOnDateMs;

    if-eqz v1, :cond_11f

    invoke-interface {v1}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    :cond_11f
    and-int/lit16 v1, v0, 0x1f1b

    if-eqz v1, :cond_128

    .line 201
    iget-object v1, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {v1}, Lo/contentAs;->RemoteActionCompatParcelizer()V

    :cond_128
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_13c

    .line 205
    sget-object v1, Lo/CoercionAction;->INSTANCE:Lo/CoercionAction;

    .line 206
    move-object v4, p0

    check-cast v4, Landroid/view/View;

    .line 207
    invoke-virtual {p1}, Lo/resolveAbstractType;->RatingCompat()J

    move-result-wide v5

    invoke-static {v5, v6}, Lo/RequestPayload;->IconCompatParcelizer(J)I

    move-result v5

    .line 205
    invoke-virtual {v1, v4, v5}, Lo/CoercionAction;->write(Landroid/view/View;I)V

    :cond_13c
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_150

    .line 211
    sget-object v1, Lo/CoercionAction;->INSTANCE:Lo/CoercionAction;

    .line 212
    move-object v4, p0

    check-cast v4, Landroid/view/View;

    .line 213
    invoke-virtual {p1}, Lo/resolveAbstractType;->onPlayFromSearch()J

    move-result-wide v5

    invoke-static {v5, v6}, Lo/RequestPayload;->IconCompatParcelizer(J)I

    move-result v5

    .line 211
    invoke-virtual {v1, v4, v5}, Lo/CoercionAction;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    .line 217
    :cond_150
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v1, v4, :cond_167

    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_167

    .line 219
    sget-object v1, Lo/getAcceptBlankAsEmpty;->INSTANCE:Lo/getAcceptBlankAsEmpty;

    move-object v4, p0

    check-cast v4, Landroid/view/View;

    invoke-virtual {p1}, Lo/resolveAbstractType;->onPause()Lo/parseVersionPart;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lo/getAcceptBlankAsEmpty;->read(Landroid/view/View;Lo/parseVersionPart;)V

    :cond_167
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-nez v1, :cond_173

    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-nez v1, :cond_173

    move v1, v3

    goto :goto_174

    :cond_173
    move v1, v2

    :goto_174
    const v4, 0x8000

    and-int/2addr v0, v4

    if-nez v0, :cond_17c

    if-eqz v1, :cond_1c9

    :cond_17c
    if-eqz v1, :cond_185

    .line 230
    sget-object v0, Lo/Separators;->AudioAttributesCompatParcelizer:Lo/Separators$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lo/Separators$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()I

    move-result v0

    goto :goto_189

    .line 232
    :cond_185
    invoke-virtual {p1}, Lo/resolveAbstractType;->handleMediaPlayPauseIfPendingOnHandler()I

    move-result v0

    .line 237
    :goto_189
    sget-object v4, Lo/Separators;->AudioAttributesCompatParcelizer:Lo/Separators$AudioAttributesCompatParcelizer;

    invoke-virtual {v4}, Lo/Separators$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()I

    move-result v4

    invoke-static {v0, v4}, Lo/Separators;->RemoteActionCompatParcelizer(II)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1b3

    if-eqz v1, :cond_1ae

    .line 240
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatCustomActionResultReceiver()Lo/releaseBuffers;

    move-result-object v0

    .line 242
    invoke-virtual {p1}, Lo/resolveAbstractType;->onCommand()Lo/switchAndReturnNext;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/releaseBuffers;->AudioAttributesCompatParcelizer(Lo/switchAndReturnNext;)V

    .line 243
    invoke-virtual {p1}, Lo/resolveAbstractType;->MediaDescriptionCompat()I

    move-result v1

    invoke-interface {v0, v1}, Lo/releaseBuffers;->RemoteActionCompatParcelizer(I)V

    .line 245
    invoke-interface {v0}, Lo/releaseBuffers;->IconCompatParcelizer()Landroid/graphics/Paint;

    move-result-object v5

    :cond_1ae
    const/4 v0, 0x2

    .line 249
    invoke-virtual {p0, v0, v5}, Landroidx/compose/ui/platform/ViewLayer;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_1c7

    .line 252
    :cond_1b3
    sget-object v1, Lo/Separators;->AudioAttributesCompatParcelizer:Lo/Separators$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Lo/Separators$AudioAttributesCompatParcelizer;->IconCompatParcelizer()I

    move-result v1

    invoke-static {v0, v1}, Lo/Separators;->RemoteActionCompatParcelizer(II)Z

    move-result v0

    if-eqz v0, :cond_1c4

    .line 253
    invoke-virtual {p0, v3, v5}, Landroidx/compose/ui/platform/ViewLayer;->setLayerType(ILandroid/graphics/Paint;)V

    move v2, v3

    goto :goto_1c7

    .line 257
    :cond_1c4
    invoke-virtual {p0, v3, v5}, Landroidx/compose/ui/platform/ViewLayer;->setLayerType(ILandroid/graphics/Paint;)V

    .line 235
    :goto_1c7
    iput-boolean v2, p0, Landroidx/compose/ui/platform/ViewLayer;->onCommand:Z

    .line 263
    :cond_1c9
    invoke-virtual {p1}, Lo/resolveAbstractType;->onMediaButtonEvent()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/platform/ViewLayer;->onPause:I

    return-void
.end method

.method public final IconCompatParcelizer([F)V
    .registers 3

    .line 440
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {v0, p0}, Lo/contentAs;->write(Ljava/lang/Object;)[F

    move-result-object p0

    if-eqz p0, :cond_b

    .line 442
    invoke-static {p1, p0}, Lo/resetWithShared;->RemoteActionCompatParcelizer([F[F)V

    :cond_b
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V
    .registers 6

    .line 337
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->getElevation()F

    move-result p2

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    if-lez p2, :cond_b

    const/4 p2, 0x1

    goto :goto_c

    :cond_b
    const/4 p2, 0x0

    :goto_c
    iput-boolean p2, p0, Landroidx/compose/ui/platform/ViewLayer;->RatingCompat:Z

    if-eqz p2, :cond_13

    .line 339
    invoke-interface {p1}, Lo/JsonParserDelegate;->write()V

    .line 341
    :cond_13
    iget-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaDescriptionCompat:Landroidx/compose/ui/platform/DrawChildContainer;

    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v1

    invoke-virtual {p2, p1, v0, v1, v2}, Landroidx/compose/ui/platform/DrawChildContainer;->AudioAttributesCompatParcelizer(Lo/JsonParserDelegate;Landroid/view/View;J)V

    .line 342
    iget-boolean p0, p0, Landroidx/compose/ui/platform/ViewLayer;->RatingCompat:Z

    if-eqz p0, :cond_26

    .line 343
    invoke-interface {p1}, Lo/JsonParserDelegate;->RemoteActionCompatParcelizer()V

    :cond_26
    return-void
.end method

.method public final RemoteActionCompatParcelizer([F)V
    .registers 3

    .line 436
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {v0, p0}, Lo/contentAs;->read(Ljava/lang/Object;)[F

    move-result-object p0

    invoke-static {p1, p0}, Lo/resetWithShared;->RemoteActionCompatParcelizer([F[F)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(J)Z
    .registers 12

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    .line 535
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x0

    int-to-long v3, v2

    shl-long/2addr v3, v0

    const/4 v5, -0x1

    int-to-long v5, v5

    const/16 v7, 0x3f

    shr-long v7, v5, v7

    shl-long/2addr v7, v0

    sub-long/2addr v5, v7

    or-long/2addr v3, v5

    and-long/2addr v3, p1

    long-to-int v0, v3

    .line 538
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 275
    iget-boolean v3, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatMediaItem:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_3d

    const/4 p1, 0x0

    cmpg-float p2, p1, v1

    if-gtz p2, :cond_3c

    .line 276
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v1, p2

    if-gez p2, :cond_3c

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_3c

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_3c

    return v4

    :cond_3c
    return v2

    .line 279
    :cond_3d
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_4a

    .line 280
    iget-object p0, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    invoke-virtual {p0, p1, p2}, Lo/JsonSerialize;->IconCompatParcelizer(J)Z

    move-result p0

    return p0

    :cond_4a
    return v4
.end method

.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 8

    .line 348
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplApi26Parcelizer:Lo/createFlattened;

    .line 543
    invoke-virtual {v0}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object v1

    invoke-virtual {v1}, Lo/charBufferLength;->read()Landroid/graphics/Canvas;

    move-result-object v1

    .line 544
    invoke-virtual {v0}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object v2

    invoke-virtual {v2, p1}, Lo/charBufferLength;->write(Landroid/graphics/Canvas;)V

    .line 545
    invoke-virtual {v0}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object v2

    check-cast v2, Lo/JsonParserDelegate;

    .line 350
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatItemReceiver()Lo/removeSoftRefsClearedByGc;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_26

    .line 351
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result p1

    if-eqz p1, :cond_26

    move p1, v4

    goto :goto_2f

    .line 353
    :cond_26
    invoke-interface {v2}, Lo/JsonParserDelegate;->IconCompatParcelizer()V

    .line 354
    iget-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->onPlayFromMediaId:Lo/JsonSerialize;

    invoke-virtual {p1, v2}, Lo/JsonSerialize;->IconCompatParcelizer(Lo/JsonParserDelegate;)V

    const/4 p1, 0x1

    .line 356
    :goto_2f
    iget-object v3, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaBrowserCompatSearchResultReceiver:Lo/MagicModuleSubmissionRequestBody;

    if-eqz v3, :cond_37

    const/4 v5, 0x0

    invoke-interface {v3, v2, v5}, Lo/MagicModuleSubmissionRequestBody;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_37
    if-eqz p1, :cond_3c

    .line 358
    invoke-interface {v2}, Lo/JsonParserDelegate;->AudioAttributesCompatParcelizer()V

    .line 546
    :cond_3c
    invoke-virtual {v0}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object p1

    invoke-virtual {p1, v1}, Lo/charBufferLength;->write(Landroid/graphics/Canvas;)V

    .line 361
    invoke-direct {p0, v4}, Landroidx/compose/ui/platform/ViewLayer;->IconCompatParcelizer(Z)V

    return-void
.end method

.method public final forceLayout()V
    .registers 1

    return-void
.end method

.method public final getCameraDistancePx()F
    .registers 2

    .line 128
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->getCameraDistance()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p0, p0

    div-float/2addr v0, p0

    return v0
.end method

.method public final getFrameRate()F
    .registers 1

    .line 87
    iget p0, p0, Landroidx/compose/ui/platform/ViewLayer;->frameRate:F

    return p0
.end method

.method public final hasOverlappingRendering()Z
    .registers 1

    .line 269
    iget-boolean p0, p0, Landroidx/compose/ui/platform/ViewLayer;->onCommand:Z

    return p0
.end method

.method public final invalidate()V
    .registers 2

    .line 365
    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-nez v0, :cond_10

    const/4 v0, 0x1

    .line 366
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->IconCompatParcelizer(Z)V

    .line 367
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    .line 368
    iget-object p0, p0, Landroidx/compose/ui/platform/ViewLayer;->onFastForward:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_10
    return-void
.end method

.method public final isFrameRateFromParent()Z
    .registers 1

    .line 89
    iget-boolean p0, p0, Landroidx/compose/ui/platform/ViewLayer;->isFrameRateFromParent:Z

    return p0
.end method

.method protected final onLayout(ZIIII)V
    .registers 6

    return-void
.end method

.method public final read()[F
    .registers 2

    .line 85
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {v0, p0}, Lo/contentAs;->read(Ljava/lang/Object;)[F

    move-result-object p0

    return-object p0
.end method

.method public final setCameraDistancePx(F)V
    .registers 3

    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/ViewLayer;->setCameraDistance(F)V

    return-void
.end method

.method public final setFrameRate(F)V
    .registers 2

    .line 87
    iput p1, p0, Landroidx/compose/ui/platform/ViewLayer;->frameRate:F

    return-void
.end method

.method public final setFrameRateFromParent(Z)V
    .registers 2

    .line 89
    iput-boolean p1, p0, Landroidx/compose/ui/platform/ViewLayer;->isFrameRateFromParent:Z

    return-void
.end method

.method public final write(J)V
    .registers 5

    .line 323
    invoke-static {p1, p2}, Lo/hasReferringProperties;->IconCompatParcelizer(J)I

    move-result v0

    .line 325
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    if-eq v0, v1, :cond_17

    .line 326
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 327
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {v0}, Lo/contentAs;->RemoteActionCompatParcelizer()V

    .line 329
    :cond_17
    invoke-static {p1, p2}, Lo/hasReferringProperties;->AudioAttributesCompatParcelizer(J)I

    move-result p1

    .line 330
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p2

    if-eq p1, p2, :cond_2e

    .line 331
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 332
    iget-object p0, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {p0}, Lo/contentAs;->RemoteActionCompatParcelizer()V

    :cond_2e
    return-void
.end method

.method public final write(Lo/getType;Z)V
    .registers 3

    if-eqz p2, :cond_8

    .line 411
    iget-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {p2, p0, p1}, Lo/contentAs;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Lo/getType;)V

    return-void

    .line 413
    :cond_8
    iget-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->handleMediaPlayPauseIfPendingOnHandler:Lo/contentAs;

    invoke-virtual {p2, p0, p1}, Lo/contentAs;->read(Ljava/lang/Object;Lo/getType;)V

    return-void
.end method

###### Class androidx.compose.ui.platform.ViewLayer.AnonymousClass5 (androidx.compose.ui.platform.ViewLayer$5)
.class final Landroidx/compose/ui/platform/ViewLayer$5;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/ViewLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/MagicModuleSubmissionRequestBody<",
        "Landroid/view/View;",
        "Landroid/graphics/Matrix;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/view/View;",
        "p0",
        "Landroid/graphics/Matrix;",
        "p1",
        "",
        "write",
        "(Landroid/view/View;Landroid/graphics/Matrix;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final write:Landroidx/compose/ui/platform/ViewLayer$5;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 450
    new-instance v0, Landroidx/compose/ui/platform/ViewLayer$5;

    invoke-direct {v0}, Landroidx/compose/ui/platform/ViewLayer$5;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/ViewLayer$5;->write:Landroidx/compose/ui/platform/ViewLayer$5;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x2

    .line 451
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 447
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/ViewLayer$5;->write(Landroid/view/View;Landroid/graphics/Matrix;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final write(Landroid/view/View;Landroid/graphics/Matrix;)V
    .registers 3

    .line 448
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p0

    .line 449
    invoke-virtual {p2, p0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    return-void
.end method

###### Class androidx.compose.ui.platform.ViewLayer.read (androidx.compose.ui.platform.ViewLayer$read)
.class public final Landroidx/compose/ui/platform/ViewLayer$read;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/ViewLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/platform/ViewLayer$read;",
        "Landroid/view/ViewOutlineProvider;",
        "Landroid/view/View;",
        "p0",
        "Landroid/graphics/Outline;",
        "p1",
        "",
        "getOutline",
        "(Landroid/view/View;Landroid/graphics/Outline;)V"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 453
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 3

    .line 455
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/compose/ui/platform/ViewLayer;

    .line 456
    invoke-static {p1}, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/platform/ViewLayer;)Lo/JsonSerialize;

    move-result-object p0

    invoke-virtual {p0}, Lo/JsonSerialize;->IconCompatParcelizer()Landroid/graphics/Outline;

    move-result-object p0

    invoke-static {p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-virtual {p2, p0}, Landroid/graphics/Outline;->set(Landroid/graphics/Outline;)V

    return-void
.end method

###### Class androidx.compose.ui.platform.ViewLayer.Companion (androidx.compose.ui.platform.ViewLayer$write)
.class public final Landroidx/compose/ui/platform/ViewLayer$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/ViewLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "write"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178\u0007@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0007\u0010\u001aR*\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178\u0007@AX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u0019\u001a\u0004\u0008\r\u0010\u001a\"\u0004\u0008\r\u0010\u001c"
    }
    d2 = {
        "Landroidx/compose/ui/platform/ViewLayer$write;",
        "",
        "<init>",
        "()V",
        "Landroid/view/View;",
        "p0",
        "",
        "RemoteActionCompatParcelizer",
        "(Landroid/view/View;)V",
        "Lkotlin/Function2;",
        "Landroid/graphics/Matrix;",
        "Lo/MagicModuleSubmissionRequestBody;",
        "Landroid/view/ViewOutlineProvider;",
        "IconCompatParcelizer",
        "Landroid/view/ViewOutlineProvider;",
        "Ljava/lang/reflect/Method;",
        "AudioAttributesImplApi21Parcelizer",
        "Ljava/lang/reflect/Method;",
        "write",
        "Ljava/lang/reflect/Field;",
        "AudioAttributesImplBaseParcelizer",
        "Ljava/lang/reflect/Field;",
        "read",
        "",
        "AudioAttributesCompatParcelizer",
        "Z",
        "()Z",
        "MediaBrowserCompatCustomActionResultReceiver",
        "(Z)V",
        "AudioAttributesImplApi26Parcelizer"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 446
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 507
    invoke-direct {p0}, Landroidx/compose/ui/platform/ViewLayer$write;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Z)V
    .registers 2

    .line 465
    invoke-static {p1}, Landroidx/compose/ui/platform/ViewLayer;->write(Z)V

    return-void
.end method

.method public final IconCompatParcelizer()Z
    .registers 1

    .line 464
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplApi21Parcelizer()Z

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 8

    const/4 v0, 0x1

    .line 470
    :try_start_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer$write;->RemoteActionCompatParcelizer()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_68

    .line 471
    invoke-static {v0}, Landroidx/compose/ui/platform/ViewLayer;->read(Z)V

    const/4 v1, 0x2

    .line 483
    new-array v3, v1, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v2

    .line 484
    new-array v4, v2, [Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v3, v0

    .line 481
    const-class v4, Ljava/lang/Class;

    const-string v5, "getDeclaredMethod"

    invoke-virtual {v4, v5, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 490
    new-array v4, v2, [Ljava/lang/Class;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v5, "updateDisplayListIfDirty"

    aput-object v5, v1, v2

    aput-object v4, v1, v0

    .line 487
    const-class v4, Landroid/view/View;

    invoke-virtual {v3, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    .line 486
    invoke-static {v1}, Landroidx/compose/ui/platform/ViewLayer;->write(Ljava/lang/reflect/Method;)V

    .line 495
    new-array v1, v0, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    aput-object v3, v1, v2

    const-class v3, Ljava/lang/Class;

    const-string v4, "getDeclaredField"

    invoke-virtual {v3, v4, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 497
    new-array v3, v0, [Ljava/lang/Object;

    const-string v4, "mRecreateDisplayList"

    aput-object v4, v3, v2

    const-class v4, Landroid/view/View;

    invoke-virtual {v1, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 496
    invoke-static {v1}, Landroidx/compose/ui/platform/ViewLayer;->read(Ljava/lang/reflect/Field;)V

    .line 500
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplBaseParcelizer()Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_5f

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 501
    :cond_5f
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->write()Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_68

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 503
    :cond_68
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->write()Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_71

    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 504
    :cond_71
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->AudioAttributesImplBaseParcelizer()Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_7c

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7c
    .catchall {:try_start_1 .. :try_end_7c} :catchall_7d

    :cond_7c
    return-void

    .line 506
    :catchall_7d
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ViewLayer$write;->IconCompatParcelizer(Z)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 461
    invoke-static {}, Landroidx/compose/ui/platform/ViewLayer;->RemoteActionCompatParcelizer()Z

    move-result p0

    return p0
.end method
