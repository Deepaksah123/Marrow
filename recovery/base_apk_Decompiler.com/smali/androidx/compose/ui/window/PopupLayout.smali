###### Class androidx.compose.ui.window.PopupLayout (androidx.compose.ui.window.PopupLayout)
.class public final Landroidx/compose/ui/window/PopupLayout;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "SourceFile"

# interfaces
.implements Lo/CoercionConfigs;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;,
        Landroidx/compose/ui/window/PopupLayout$RemoteActionCompatParcelizer$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u0015\n\u0000\u0008\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.BY\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008 \u0010\u0019J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020!H\u0010\u00a2\u0006\u0004\u0008\"\u0010#J7\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020!2\u0006\u0010\t\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010\r\u001a\u00020!H\u0010\u00a2\u0006\u0004\u0008\"\u0010$J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0019J\u000f\u0010)\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008)\u0010\u0019J5\u0010\"\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020*\u00a2\u0006\u0004\u0008\"\u0010+J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\"\u0010,J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020-\u00a2\u0006\u0004\u0008.\u0010/J\r\u00100\u001a\u00020\u0004\u00a2\u0006\u0004\u00080\u0010\u0019J\u000f\u00101\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u00081\u0010\u0019J\r\u00102\u001a\u00020\u0004\u00a2\u0006\u0004\u00082\u0010\u0019J\r\u0010.\u001a\u00020\u0004\u00a2\u0006\u0004\u0008.\u0010\u0019J\u0019\u00104\u001a\u00020\u00122\u0008\u0010\u0005\u001a\u0004\u0018\u000103H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00106\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H\u0016\u00a2\u0006\u0004\u00086\u00107J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008\"\u00108J\u000f\u0010:\u001a\u000209H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002\u00a2\u0006\u0004\u0008=\u0010>R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010?R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\"\u0010C\u001a\u00020\u00088\u0007@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR\u0014\u0010J\u001a\u00020\n8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010IR\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010KR\u0014\u0010\"\u001a\u00020\u00148\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u00100\u001a\u00020N8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u00102\u001a\u0002098\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010QR\"\u0010R\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR\"\u0010X\u001a\u00020*8\u0007@\u0007X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[\"\u0004\u0008\\\u00108R/\u0010d\u001a\u0004\u0018\u00010]2\u0008\u0010\u0005\u001a\u0004\u0018\u00010]8G@GX\u0087\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR/\u0010:\u001a\u0004\u0018\u00010-2\u0008\u0010\u0005\u001a\u0004\u0018\u00010-8C@CX\u0083\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008)\u0010_\u001a\u0004\u0008e\u0010f\"\u0004\u0008\"\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008e\u0010gR\u001b\u0010\u0018\u001a\u00020\u00128GX\u0087\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010h\u001a\u0004\u0008@\u0010iR\u0014\u0010e\u001a\u00020j8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010kR\u0014\u0010(\u001a\u00020l8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\u0014\u0010L\u001a\u00020o8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u0018\u0010)\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010sR7\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038C@CX\u0083\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00081\u0010_\u001a\u0004\u0008L\u0010t\"\u0004\u0008.\u0010uR$\u0010A\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128\u0015@RX\u0095\u000e\u00a2\u0006\u000c\n\u0004\u0008v\u0010K\u001a\u0004\u0008\"\u0010iR\u0014\u0010v\u001a\u00020w8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010x"
    }
    d2 = {
        "Landroidx/compose/ui/window/PopupLayout;",
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "Lo/CoercionConfigs;",
        "Lkotlin/Function0;",
        "",
        "p0",
        "Lo/withDateFormat;",
        "p1",
        "",
        "p2",
        "Landroid/view/View;",
        "p3",
        "Lo/bufferMapProperty;",
        "p4",
        "Lo/DateDeserializersCalendarDeserializer;",
        "p5",
        "Ljava/util/UUID;",
        "p6",
        "",
        "p7",
        "Lo/DateDeserializers;",
        "p8",
        "<init>",
        "(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;)V",
        "AudioAttributesImplApi26Parcelizer",
        "()V",
        "Lo/convertNumberToLong;",
        "setContent",
        "(Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)V",
        "IconCompatParcelizer",
        "(Lo/_handleUnrecognizedCharacterEscape;I)V",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "",
        "write",
        "(II)V",
        "(ZIIII)V",
        "Landroid/view/KeyEvent;",
        "dispatchKeyEvent",
        "(Landroid/view/KeyEvent;)Z",
        "MediaBrowserCompatMediaItem",
        "MediaBrowserCompatSearchResultReceiver",
        "Lo/tryToResolveUnresolved;",
        "(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Lo/tryToResolveUnresolved;)V",
        "(Lo/withDateFormat;)V",
        "Lo/isAbstract;",
        "AudioAttributesCompatParcelizer",
        "(Lo/isAbstract;)V",
        "AudioAttributesImplBaseParcelizer",
        "AudioAttributesImplApi21Parcelizer",
        "MediaBrowserCompatCustomActionResultReceiver",
        "Landroid/view/MotionEvent;",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "setLayoutDirection",
        "(I)V",
        "(Lo/tryToResolveUnresolved;)V",
        "Landroid/view/WindowManager$LayoutParams;",
        "MediaBrowserCompatItemReceiver",
        "()Landroid/view/WindowManager$LayoutParams;",
        "Lo/appendReferring;",
        "MediaDescriptionCompat",
        "()Lo/appendReferring;",
        "Lo/getCreatedOnDateMs;",
        "read",
        "onAddQueueItem",
        "Lo/withDateFormat;",
        "testTag",
        "Ljava/lang/String;",
        "getTestTag",
        "()Ljava/lang/String;",
        "setTestTag",
        "(Ljava/lang/String;)V",
        "Landroid/view/View;",
        "RemoteActionCompatParcelizer",
        "Z",
        "MediaMetadataCompat",
        "Lo/DateDeserializers;",
        "Landroid/view/WindowManager;",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "Landroid/view/WindowManager;",
        "Landroid/view/WindowManager$LayoutParams;",
        "positionProvider",
        "Lo/DateDeserializersCalendarDeserializer;",
        "getPositionProvider",
        "()Lo/DateDeserializersCalendarDeserializer;",
        "setPositionProvider",
        "(Lo/DateDeserializersCalendarDeserializer;)V",
        "parentLayoutDirection",
        "Lo/tryToResolveUnresolved;",
        "getParentLayoutDirection",
        "()Lo/tryToResolveUnresolved;",
        "setParentLayoutDirection",
        "Lo/getKey;",
        "popupContentSize$delegate",
        "Lo/InputAccessor;",
        "getPopupContentSize-bOM6tXw",
        "()Lo/getKey;",
        "setPopupContentSize-fhxjrPA",
        "(Lo/getKey;)V",
        "popupContentSize",
        "RatingCompat",
        "()Lo/isAbstract;",
        "Lo/appendReferring;",
        "Lo/parseDouble;",
        "()Z",
        "Lo/assignParameter;",
        "F",
        "Landroid/graphics/Rect;",
        "onCommand",
        "Landroid/graphics/Rect;",
        "Lo/g0;",
        "handleMediaPlayPauseIfPendingOnHandler",
        "Lo/g0;",
        "",
        "Ljava/lang/Object;",
        "()Lo/MagicModuleSubmissionRequestBody;",
        "(Lo/MagicModuleSubmissionRequestBody;)V",
        "onCustomAction",
        "",
        "[I"
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
.field private static final AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;

.field public static final IconCompatParcelizer:I

.field private static final read:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "Landroidx/compose/ui/window/PopupLayout;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final AudioAttributesImplApi21Parcelizer:Lo/InputAccessor;

.field private final AudioAttributesImplApi26Parcelizer:Z

.field private final AudioAttributesImplBaseParcelizer:F

.field private final MediaBrowserCompatCustomActionResultReceiver:[I

.field private final MediaBrowserCompatItemReceiver:Landroid/view/View;

.field private MediaBrowserCompatMediaItem:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaBrowserCompatSearchResultReceiver:Lo/InputAccessor;

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/WindowManager;

.field private final MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

.field private final MediaMetadataCompat:Lo/DateDeserializers;

.field private RatingCompat:Lo/appendReferring;

.field private RemoteActionCompatParcelizer:Ljava/lang/Object;

.field private final handleMediaPlayPauseIfPendingOnHandler:Lo/g0;

.field private onAddQueueItem:Lo/withDateFormat;

.field private final onCommand:Landroid/graphics/Rect;

.field private onCustomAction:Z

.field private parentLayoutDirection:Lo/tryToResolveUnresolved;

.field private final popupContentSize$delegate:Lo/InputAccessor;

.field private positionProvider:Lo/DateDeserializersCalendarDeserializer;

.field private testTag:Ljava/lang/String;

.field private final write:Lo/parseDouble;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/window/PopupLayout;->IconCompatParcelizer:I

    .line 888
    sget-object v0, Landroidx/compose/ui/window/PopupLayout$3;->write:Landroidx/compose/ui/window/PopupLayout$3;

    check-cast v0, Lo/getAnswerMap;

    sput-object v0, Landroidx/compose/ui/window/PopupLayout;->read:Lo/getAnswerMap;

    return-void
.end method

.method public constructor <init>(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;)V
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;",
            "Lo/withDateFormat;",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            "Lo/bufferMapProperty;",
            "Lo/DateDeserializersCalendarDeserializer;",
            "Ljava/util/UUID;",
            "Z",
            "Lo/DateDeserializers;",
            ")V"
        }
    .end annotation

    .line 499
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    .line 483
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    .line 485
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatMediaItem:Lo/getCreatedOnDateMs;

    .line 486
    iput-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    .line 487
    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->testTag:Ljava/lang/String;

    .line 488
    iput-object p4, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 492
    iput-boolean p8, p0, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplApi26Parcelizer:Z

    .line 493
    iput-object p9, p0, Landroidx/compose/ui/window/PopupLayout;->MediaMetadataCompat:Lo/DateDeserializers;

    .line 501
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, ""

    invoke-static {p1, p2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/WindowManager;

    .line 503
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    .line 506
    iput-object p6, p0, Landroidx/compose/ui/window/PopupLayout;->positionProvider:Lo/DateDeserializersCalendarDeserializer;

    .line 509
    sget-object p1, Lo/tryToResolveUnresolved;->write:Lo/tryToResolveUnresolved;

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->parentLayoutDirection:Lo/tryToResolveUnresolved;

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 510
    invoke-static {p1, p1, p2, p1}, Lo/_qbuf;->RemoteActionCompatParcelizer$default(Ljava/lang/Object;Lo/quoteAsUTF8;ILjava/lang/Object;)Lo/InputAccessor;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->popupContentSize$delegate:Lo/InputAccessor;

    .line 511
    invoke-static {p1, p1, p2, p1}, Lo/_qbuf;->RemoteActionCompatParcelizer$default(Ljava/lang/Object;Lo/quoteAsUTF8;ILjava/lang/Object;)Lo/InputAccessor;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatSearchResultReceiver:Lo/InputAccessor;

    .line 515
    new-instance p3, Landroidx/compose/ui/window/PopupLayout$4;

    invoke-direct {p3, p0}, Landroidx/compose/ui/window/PopupLayout$4;-><init>(Landroidx/compose/ui/window/PopupLayout;)V

    check-cast p3, Lo/getCreatedOnDateMs;

    invoke-static {p3}, Lo/_qbuf;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/parseDouble;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->write:Lo/parseDouble;

    const/high16 p3, 0x41000000    # 8.0f

    .line 996
    invoke-static {p3}, Lo/assignParameter;->IconCompatParcelizer(F)F

    move-result p3

    .line 521
    iput p3, p0, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplBaseParcelizer:F

    .line 524
    new-instance p6, Landroid/graphics/Rect;

    invoke-direct {p6}, Landroid/graphics/Rect;-><init>()V

    iput-object p6, p0, Landroidx/compose/ui/window/PopupLayout;->onCommand:Landroid/graphics/Rect;

    .line 531
    new-instance p6, Landroidx/compose/ui/window/PopupLayout$1;

    invoke-direct {p6, p0}, Landroidx/compose/ui/window/PopupLayout$1;-><init>(Landroidx/compose/ui/window/PopupLayout;)V

    check-cast p6, Lo/getAnswerMap;

    .line 530
    new-instance p8, Lo/g0;

    invoke-direct {p8, p6}, Lo/g0;-><init>(Lo/getAnswerMap;)V

    iput-object p8, p0, Landroidx/compose/ui/window/PopupLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/g0;

    const p6, 0x1020002

    .line 546
    invoke-virtual {p0, p6}, Landroid/view/View;->setId(I)V

    .line 547
    move-object p6, p0

    check-cast p6, Landroid/view/View;

    invoke-static {p4}, Lo/isCreatorVisible;->write(Landroid/view/View;)Lo/hasGetter;

    move-result-object p8

    invoke-static {p6, p8}, Lo/isCreatorVisible;->IconCompatParcelizer(Landroid/view/View;Lo/hasGetter;)V

    .line 548
    invoke-static {p4}, Lo/isFieldVisible;->write(Landroid/view/View;)Lo/TypeResolutionContext;

    move-result-object p8

    invoke-static {p6, p8}, Lo/isFieldVisible;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/TypeResolutionContext;)V

    .line 549
    invoke-static {p4}, Lo/setCenterTextRadiusPercent;->IconCompatParcelizer(Landroid/view/View;)Lo/PieChart;

    move-result-object p4

    invoke-static {p6, p4}, Lo/setCenterTextRadiusPercent;->read(Landroid/view/View;Lo/PieChart;)V

    .line 552
    sget p4, Lo/_handleApos$AudioAttributesCompatParcelizer;->compose_view_saveable_id_tag:I

    const-string p6, "Popup:"

    invoke-static {p7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p0, p4, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 p4, 0x0

    .line 555
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 557
    invoke-interface {p5, p3}, Lo/bufferMapProperty;->AudioAttributesCompatParcelizer(F)F

    move-result p3

    invoke-virtual {p0, p3}, Landroidx/compose/ui/window/PopupLayout;->setElevation(F)V

    .line 563
    new-instance p3, Landroidx/compose/ui/window/PopupLayout$5;

    invoke-direct {p3}, Landroidx/compose/ui/window/PopupLayout$5;-><init>()V

    check-cast p3, Landroid/view/ViewOutlineProvider;

    .line 562
    invoke-virtual {p0, p3}, Landroidx/compose/ui/window/PopupLayout;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 575
    sget-object p3, Lo/push;->write:Lo/push;

    invoke-virtual {p3}, Lo/push;->read()Lo/MagicModuleSubmissionRequestBody;

    move-result-object p3

    invoke-static {p3, p1, p2, p1}, Lo/_qbuf;->RemoteActionCompatParcelizer$default(Ljava/lang/Object;Lo/quoteAsUTF8;ILjava/lang/Object;)Lo/InputAccessor;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplApi21Parcelizer:Lo/InputAccessor;

    .line 716
    new-array p1, p2, [I

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatCustomActionResultReceiver:[I

    return-void
.end method

.method public synthetic constructor <init>(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 23

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_f

    .line 495
    new-instance v0, Lo/ContainerDeserializerBase;

    invoke-direct {v0}, Lo/ContainerDeserializerBase;-><init>()V

    check-cast v0, Lo/DateDeserializers;

    move-object v10, v0

    goto :goto_11

    :cond_f
    move-object/from16 v10, p9

    :goto_11
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    .line 484
    invoke-direct/range {v1 .. v10}, Landroidx/compose/ui/window/PopupLayout;-><init>(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;)V

    return-void
.end method

.method private final AudioAttributesCompatParcelizer(Lo/MagicModuleSubmissionRequestBody;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/MagicModuleSubmissionRequestBody<",
            "-",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "-",
            "Ljava/lang/Integer;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 575
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplApi21Parcelizer:Lo/InputAccessor;

    .line 1006
    invoke-interface {p0, p1}, Lo/InputAccessor;->write(Ljava/lang/Object;)V

    return-void
.end method

.method private final MediaBrowserCompatItemReceiver()Landroid/view/WindowManager$LayoutParams;
    .registers 4

    .line 858
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    const v1, 0x800033

    .line 860
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 862
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    iget-object v2, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-static {v2}, Lo/popOrNull;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v2

    invoke-static {v1, v2}, Lo/popOrNull;->IconCompatParcelizer(Lo/withDateFormat;Z)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 v1, 0x3ea

    .line 864
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 867
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v1

    iput-object v1, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    const/4 v1, -0x2

    .line 870
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 871
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v1, -0x3

    .line 873
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 877
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v1, Lo/_handleApos$IconCompatParcelizer;->default_popup_window_title:I

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {v0, p0}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private final MediaBrowserCompatMediaItem()V
    .registers 3

    .line 657
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-virtual {v0}, Lo/withDateFormat;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_22

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_22

    .line 660
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    if-nez v0, :cond_1a

    .line 661
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatMediaItem:Lo/getCreatedOnDateMs;

    invoke-static {v0}, Lo/CollectionDeserializer;->ci_(Lo/getCreatedOnDateMs;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    .line 663
    :cond_1a
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    invoke-static {v0, p0}, Lo/CollectionDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/Object;)V

    :cond_22
    return-void
.end method

.method private final MediaBrowserCompatSearchResultReceiver()V
    .registers 3

    .line 667
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_e

    .line 668
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/CollectionDeserializer;->write(Landroid/view/View;Ljava/lang/Object;)V

    :cond_e
    const/4 v0, 0x0

    .line 670
    iput-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    return-void
.end method

.method private final MediaDescriptionCompat()Lo/appendReferring;
    .registers 3

    .line 882
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onCommand:Landroid/graphics/Rect;

    .line 883
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaMetadataCompat:Lo/DateDeserializers;

    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-interface {v1, p0, v0}, Lo/DateDeserializers;->write(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 884
    invoke-static {v0}, Lo/popOrNull;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)Lo/appendReferring;

    move-result-object p0

    return-object p0
.end method

.method private final MediaMetadataCompat()Lo/MagicModuleSubmissionRequestBody;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/MagicModuleSubmissionRequestBody<",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "Ljava/lang/Integer;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 575
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplApi21Parcelizer:Lo/InputAccessor;

    check-cast p0, Lo/parseDouble;

    .line 1005
    invoke-interface {p0}, Lo/parseDouble;->read()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/MagicModuleSubmissionRequestBody;

    return-object p0
.end method

.method private final RatingCompat()Lo/isAbstract;
    .registers 1

    .line 511
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatSearchResultReceiver:Lo/InputAccessor;

    check-cast p0, Lo/parseDouble;

    .line 1001
    invoke-interface {p0}, Lo/parseDouble;->read()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/isAbstract;

    return-object p0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Landroidx/compose/ui/window/PopupLayout;)Lo/isAbstract;
    .registers 1

    .line 483
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->RatingCompat()Lo/isAbstract;

    move-result-object p0

    return-object p0
.end method

.method private final write(Lo/isAbstract;)V
    .registers 2

    .line 511
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatSearchResultReceiver:Lo/InputAccessor;

    .line 1002
    invoke-interface {p0, p1}, Lo/InputAccessor;->write(Ljava/lang/Object;)V

    return-void
.end method

.method private final write(Lo/tryToResolveUnresolved;)V
    .registers 4

    .line 849
    sget-object v0, Landroidx/compose/ui/window/PopupLayout$RemoteActionCompatParcelizer$WhenMappings;->write:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_15

    const/4 v1, 0x2

    if-ne p1, v1, :cond_f

    goto :goto_16

    :cond_f
    new-instance p0, Lo/RenewEligibleCreator;

    invoke-direct {p0}, Lo/RenewEligibleCreator;-><init>()V

    throw p0

    :cond_15
    const/4 v0, 0x0

    .line 853
    :goto_16
    invoke-super {p0, v0}, Landroidx/compose/ui/platform/AbstractComposeView;->setLayoutDirection(I)V

    return-void
.end method

.method private final write(Lo/withDateFormat;)V
    .registers 4

    .line 686
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-static {v0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-void

    .line 688
    :cond_9
    invoke-virtual {p1}, Lo/withDateFormat;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-virtual {v0}, Lo/withDateFormat;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_20

    .line 691
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 692
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 695
    :cond_20
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    .line 696
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-static {v1}, Lo/popOrNull;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v1

    invoke-static {p1, v1}, Lo/popOrNull;->IconCompatParcelizer(Lo/withDateFormat;Z)I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 698
    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaMetadataCompat:Lo/DateDeserializers;

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/WindowManager;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    check-cast p0, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, v0, v1, p0}, Lo/DateDeserializers;->IconCompatParcelizer(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 811
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/isCreatorVisible;->IconCompatParcelizer(Landroid/view/View;Lo/hasGetter;)V

    .line 812
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/WindowManager;

    invoke-interface {p0, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Lo/isAbstract;)V
    .registers 2

    .line 707
    invoke-direct {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->write(Lo/isAbstract;)V

    .line 708
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()V
    .registers 15

    .line 747
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->RatingCompat()Lo/isAbstract;

    move-result-object v0

    if-eqz v0, :cond_5e

    invoke-interface {v0}, Lo/isAbstract;->MediaBrowserCompatItemReceiver()Z

    move-result v1

    if-nez v1, :cond_d

    const/4 v0, 0x0

    :cond_d
    if-eqz v0, :cond_5e

    .line 748
    invoke-interface {v0}, Lo/isAbstract;->write()J

    move-result-wide v1

    .line 759
    iget-boolean v3, p0, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v3, :cond_1c

    .line 760
    invoke-static {v0}, Lo/hasRawClass;->MediaBrowserCompatCustomActionResultReceiver(Lo/isAbstract;)J

    move-result-wide v3

    goto :goto_20

    .line 762
    :cond_1c
    invoke-static {v0}, Lo/hasRawClass;->AudioAttributesImplApi26Parcelizer(Lo/isAbstract;)J

    move-result-wide v3

    :goto_20
    const/16 v0, 0x20

    shr-long v5, v3, v0

    long-to-int v5, v5

    .line 1010
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 1014
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    long-to-int v3, v3

    .line 1010
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    .line 1014
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-long v4, v5

    int-to-long v6, v3

    shl-long v3, v4, v0

    const/4 v5, 0x0

    int-to-long v8, v5

    shl-long/2addr v8, v0

    const/4 v5, -0x1

    int-to-long v10, v5

    const/16 v5, 0x3f

    shr-long v12, v10, v5

    shl-long/2addr v12, v0

    sub-long/2addr v10, v12

    or-long/2addr v8, v10

    and-long v5, v8, v6

    or-long/2addr v3, v5

    .line 1017
    invoke-static {v3, v4}, Lo/hasReferringProperties;->read(J)J

    move-result-wide v3

    .line 766
    invoke-static {v3, v4, v1, v2}, Lo/ReadableObjectId;->RemoteActionCompatParcelizer(JJ)Lo/appendReferring;

    move-result-object v0

    .line 767
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->RatingCompat:Lo/appendReferring;

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5e

    .line 768
    iput-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->RatingCompat:Lo/appendReferring;

    .line 769
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatCustomActionResultReceiver()V

    :cond_5e
    return-void
.end method

.method public final AudioAttributesImplApi26Parcelizer()V
    .registers 3

    .line 581
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/WindowManager;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    check-cast p0, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v0, v1, p0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final AudioAttributesImplBaseParcelizer()V
    .registers 7

    .line 731
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 733
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatCustomActionResultReceiver:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    .line 734
    iget-object v5, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-virtual {v5, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 735
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatCustomActionResultReceiver:[I

    aget v1, v0, v1

    if-ne v2, v1, :cond_1e

    aget v0, v0, v3

    if-ne v4, v0, :cond_1e

    goto :goto_21

    .line 736
    :cond_1e
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesImplApi21Parcelizer()V

    :cond_21
    :goto_21
    return-void
.end method

.method public final IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V
    .registers 8

    const v0, -0x331e2520

    .line 592
    invoke-interface {p1, v0}, Lo/_handleUnrecognizedCharacterEscape;->write(I)Lo/_handleUnrecognizedCharacterEscape;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_17

    invoke-interface {p1, p0}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, 0x4

    goto :goto_15

    :cond_14
    move v1, v2

    :goto_15
    or-int/2addr v1, p2

    goto :goto_18

    :cond_17
    move v1, p2

    :goto_18
    and-int/lit8 v3, v1, 0x3

    const/4 v4, 0x0

    if-eq v3, v2, :cond_1f

    const/4 v2, 0x1

    goto :goto_20

    :cond_1f
    move v2, v4

    :goto_20
    and-int/lit8 v3, v1, 0x1

    invoke-interface {p1, v2, v3}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v2

    if-eqz v2, :cond_49

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v2

    if-eqz v2, :cond_34

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:591)"

    invoke-static {v0, v1, v2, v3}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 593
    :cond_34
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->MediaMetadataCompat()Lo/MagicModuleSubmissionRequestBody;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/MagicModuleSubmissionRequestBody;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_4c

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_4c

    .line 592
    :cond_49
    invoke-interface {p1}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 594
    :cond_4c
    :goto_4c
    invoke-interface {p1}, Lo/_handleUnrecognizedCharacterEscape;->MediaBrowserCompatSearchResultReceiver()Lo/releaseNameCopyBuffer;

    move-result-object p1

    if-eqz p1, :cond_5c

    new-instance v0, Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;-><init>(Landroidx/compose/ui/window/PopupLayout;I)V

    check-cast v0, Lo/MagicModuleSubmissionRequestBody;

    invoke-interface {p1, v0}, Lo/releaseNameCopyBuffer;->read(Lo/MagicModuleSubmissionRequestBody;)V

    :cond_5c
    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 16

    .line 775
    iget-object v3, p0, Landroidx/compose/ui/window/PopupLayout;->RatingCompat:Lo/appendReferring;

    if-eqz v3, :cond_87

    .line 776
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->getPopupContentSize-bOM6tXw()Lo/getKey;

    move-result-object v0

    if-eqz v0, :cond_87

    invoke-virtual {v0}, Lo/getKey;->RemoteActionCompatParcelizer()J

    move-result-wide v6

    .line 779
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat()Lo/appendReferring;

    move-result-object v0

    invoke-virtual {v0}, Lo/appendReferring;->MediaBrowserCompatItemReceiver()I

    move-result v1

    invoke-virtual {v0}, Lo/appendReferring;->IconCompatParcelizer()I

    move-result v0

    int-to-long v1, v1

    int-to-long v4, v0

    const/16 v8, 0x20

    shl-long v0, v1, v8

    const/4 v2, 0x0

    int-to-long v9, v2

    shl-long/2addr v9, v8

    const/4 v2, -0x1

    int-to-long v11, v2

    const/16 v2, 0x3f

    shr-long v13, v11, v2

    shl-long/2addr v13, v8

    sub-long/2addr v11, v13

    or-long/2addr v9, v11

    and-long/2addr v4, v9

    or-long/2addr v0, v4

    .line 1019
    invoke-static {v0, v1}, Lo/getKey;->read(J)J

    move-result-wide v9

    .line 786
    new-instance v11, Lo/MagicModuleUseCaseImplWhenMappings$read;

    invoke-direct {v11}, Lo/MagicModuleUseCaseImplWhenMappings$read;-><init>()V

    sget-object v0, Lo/hasReferringProperties;->AudioAttributesCompatParcelizer:Lo/hasReferringProperties$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lo/hasReferringProperties$AudioAttributesCompatParcelizer;->write()J

    move-result-wide v0

    iput-wide v0, v11, Lo/MagicModuleUseCaseImplWhenMappings$read;->IconCompatParcelizer:J

    .line 787
    iget-object v12, p0, Landroidx/compose/ui/window/PopupLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/g0;

    sget-object v13, Landroidx/compose/ui/window/PopupLayout;->read:Lo/getAnswerMap;

    new-instance v14, Landroidx/compose/ui/window/PopupLayout$2;

    move-object v0, v14

    move-object v1, v11

    move-object v2, p0

    move-wide v4, v9

    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/window/PopupLayout$2;-><init>(Lo/MagicModuleUseCaseImplWhenMappings$read;Landroidx/compose/ui/window/PopupLayout;Lo/appendReferring;JJ)V

    check-cast v14, Lo/getCreatedOnDateMs;

    invoke-virtual {v12, p0, v13, v14}, Lo/g0;->IconCompatParcelizer(Ljava/lang/Object;Lo/getAnswerMap;Lo/getCreatedOnDateMs;)V

    .line 797
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    iget-wide v1, v11, Lo/MagicModuleUseCaseImplWhenMappings$read;->IconCompatParcelizer:J

    invoke-static {v1, v2}, Lo/hasReferringProperties;->IconCompatParcelizer(J)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 798
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    iget-wide v1, v11, Lo/MagicModuleUseCaseImplWhenMappings$read;->IconCompatParcelizer:J

    invoke-static {v1, v2}, Lo/hasReferringProperties;->AudioAttributesCompatParcelizer(J)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 800
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-virtual {v0}, Lo/withDateFormat;->write()Z

    move-result v0

    if-eqz v0, :cond_79

    .line 803
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaMetadataCompat:Lo/DateDeserializers;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    shr-long v2, v9, v8

    long-to-int v2, v2

    long-to-int v3, v9

    invoke-interface {v0, v1, v2, v3}, Lo/DateDeserializers;->write(Landroid/view/View;II)V

    .line 806
    :cond_79
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaMetadataCompat:Lo/DateDeserializers;

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/WindowManager;

    move-object v2, p0

    check-cast v2, Landroid/view/View;

    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    check-cast p0, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {v0, v1, v2, p0}, Lo/DateDeserializers;->IconCompatParcelizer(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_87
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 5

    .line 640
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-virtual {v0}, Lo/withDateFormat;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-super {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0

    .line 641
    :cond_d
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1c

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x6f

    if-ne v0, v1, :cond_52

    .line 642
    :cond_1c
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-nez v0, :cond_27

    invoke-super {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0

    .line 643
    :cond_27
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_38

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_38

    .line 644
    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    return v2

    .line 646
    :cond_38
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v2, :cond_52

    .line 647
    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_52

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_52

    .line 648
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatMediaItem:Lo/getCreatedOnDateMs;

    if-eqz p0, :cond_51

    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    :cond_51
    return v2

    .line 653
    :cond_52
    invoke-super {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public final getParentLayoutDirection()Lo/tryToResolveUnresolved;
    .registers 1

    .line 509
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->parentLayoutDirection:Lo/tryToResolveUnresolved;

    return-object p0
.end method

.method public final getPopupContentSize-bOM6tXw()Lo/getKey;
    .registers 1

    .line 510
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->popupContentSize$delegate:Lo/InputAccessor;

    check-cast p0, Lo/parseDouble;

    .line 998
    invoke-interface {p0}, Lo/parseDouble;->read()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/getKey;

    return-object p0
.end method

.method public final getPositionProvider()Lo/DateDeserializersCalendarDeserializer;
    .registers 1

    .line 506
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->positionProvider:Lo/DateDeserializersCalendarDeserializer;

    return-object p0
.end method

.method public final getTestTag()Ljava/lang/String;
    .registers 1

    .line 487
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->testTag:Ljava/lang/String;

    return-object p0
.end method

.method public final onAttachedToWindow()V
    .registers 2

    .line 597
    invoke-super {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->onAttachedToWindow()V

    .line 598
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/g0;

    invoke-virtual {v0}, Lo/g0;->AudioAttributesCompatParcelizer()V

    .line 599
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatMediaItem()V

    return-void
.end method

.method protected final onDetachedFromWindow()V
    .registers 2

    .line 603
    invoke-super {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->onDetachedFromWindow()V

    .line 604
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/g0;

    invoke-virtual {v0}, Lo/g0;->read()V

    .line 605
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->handleMediaPlayPauseIfPendingOnHandler:Lo/g0;

    invoke-virtual {v0}, Lo/g0;->RemoteActionCompatParcelizer()V

    .line 606
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatSearchResultReceiver()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    .line 820
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-virtual {v0}, Lo/withDateFormat;->read()Z

    move-result v0

    if-nez v0, :cond_d

    .line 821
    invoke-super {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    :cond_d
    const/4 v0, 0x1

    if-eqz p1, :cond_49

    .line 828
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_49

    .line 829
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_41

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v1, v1, v3

    if-gez v1, :cond_41

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_41

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_49

    .line 831
    :cond_41
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatMediaItem:Lo/getCreatedOnDateMs;

    if-eqz p0, :cond_48

    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    :cond_48
    return v0

    :cond_49
    if-eqz p1, :cond_5a

    .line 833
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_5a

    .line 834
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatMediaItem:Lo/getCreatedOnDateMs;

    if-eqz p0, :cond_59

    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    :cond_59
    return v0

    .line 838
    :cond_5a
    invoke-super {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public final read()Z
    .registers 1

    .line 515
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->write:Lo/parseDouble;

    .line 1004
    invoke-interface {p0}, Lo/parseDouble;->read()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public final setContent(Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/convertNumberToLong;",
            "Lo/MagicModuleSubmissionRequestBody<",
            "-",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "-",
            "Ljava/lang/Integer;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 585
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->setParentCompositionContext(Lo/convertNumberToLong;)V

    .line 586
    invoke-direct {p0, p2}, Landroidx/compose/ui/window/PopupLayout;->AudioAttributesCompatParcelizer(Lo/MagicModuleSubmissionRequestBody;)V

    const/4 p1, 0x1

    .line 587
    iput-boolean p1, p0, Landroidx/compose/ui/window/PopupLayout;->onCustomAction:Z

    return-void
.end method

.method public final setLayoutDirection(I)V
    .registers 2

    return-void
.end method

.method public final setParentLayoutDirection(Lo/tryToResolveUnresolved;)V
    .registers 2

    .line 509
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->parentLayoutDirection:Lo/tryToResolveUnresolved;

    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(Lo/getKey;)V
    .registers 2

    .line 510
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->popupContentSize$delegate:Lo/InputAccessor;

    .line 999
    invoke-interface {p0, p1}, Lo/InputAccessor;->write(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPositionProvider(Lo/DateDeserializersCalendarDeserializer;)V
    .registers 2

    .line 506
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->positionProvider:Lo/DateDeserializersCalendarDeserializer;

    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .registers 2

    .line 487
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->testTag:Ljava/lang/String;

    return-void
.end method

.method public final write(II)V
    .registers 4

    .line 610
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-virtual {v0}, Lo/withDateFormat;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 611
    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/AbstractComposeView;->write(II)V

    return-void

    .line 617
    :cond_c
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat()Lo/appendReferring;

    move-result-object p1

    .line 619
    invoke-virtual {p1}, Lo/appendReferring;->MediaBrowserCompatItemReceiver()I

    move-result p2

    const/high16 v0, -0x80000000

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 621
    invoke-virtual {p1}, Lo/appendReferring;->IconCompatParcelizer()I

    move-result p1

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 622
    invoke-super {p0, p2, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->write(II)V

    return-void
.end method

.method public final write(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Lo/tryToResolveUnresolved;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;",
            "Lo/withDateFormat;",
            "Ljava/lang/String;",
            "Lo/tryToResolveUnresolved;",
            ")V"
        }
    .end annotation

    .line 679
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatMediaItem:Lo/getCreatedOnDateMs;

    .line 680
    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->testTag:Ljava/lang/String;

    .line 681
    invoke-direct {p0, p2}, Landroidx/compose/ui/window/PopupLayout;->write(Lo/withDateFormat;)V

    .line 682
    invoke-direct {p0, p4}, Landroidx/compose/ui/window/PopupLayout;->write(Lo/tryToResolveUnresolved;)V

    return-void
.end method

.method public final write(ZIIII)V
    .registers 6

    .line 627
    invoke-super/range {p0 .. p5}, Landroidx/compose/ui/platform/AbstractComposeView;->write(ZIIII)V

    .line 630
    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->onAddQueueItem:Lo/withDateFormat;

    invoke-virtual {p1}, Lo/withDateFormat;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p1

    if-nez p1, :cond_30

    const/4 p1, 0x0

    .line 631
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_30

    .line 632
    iget-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 633
    iget-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 634
    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->MediaMetadataCompat:Lo/DateDeserializers;

    iget-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/WindowManager;

    move-object p3, p0

    check-cast p3, Landroid/view/View;

    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout;->MediaDescriptionCompat:Landroid/view/WindowManager$LayoutParams;

    check-cast p0, Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1, p2, p3, p0}, Lo/DateDeserializers;->IconCompatParcelizer(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_30
    return-void
.end method

.method public final write()Z
    .registers 1

    .line 577
    iget-boolean p0, p0, Landroidx/compose/ui/window/PopupLayout;->onCustomAction:Z

    return p0
.end method

###### Class androidx.compose.ui.window.PopupLayout.AnonymousClass1 (androidx.compose.ui.window.PopupLayout$1)
.class public final Landroidx/compose/ui/window/PopupLayout$1;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/PopupLayout;-><init>(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/getCreatedOnDateMs<",
        "+",
        "Lo/getShowPopup;",
        ">;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "p0",
        "read",
        "(Lo/getCreatedOnDateMs;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/PopupLayout;)V
    .registers 2

    .line 540
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout$1;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Lo/getCreatedOnDateMs;)V
    .registers 1

    .line 539
    invoke-static {p0}, Landroidx/compose/ui/window/PopupLayout$1;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)V

    return-void
.end method

.method private static final RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)V
    .registers 1

    .line 538
    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 531
    check-cast p1, Lo/getCreatedOnDateMs;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout$1;->read(Lo/getCreatedOnDateMs;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read(Lo/getCreatedOnDateMs;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 535
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout$1;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;

    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_18

    .line 536
    invoke-interface {p1}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void

    .line 538
    :cond_18
    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout$1;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;

    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p0

    if-eqz p0, :cond_28

    new-instance v0, Lo/getContentDeserializer;

    invoke-direct {v0, p1}, Lo/getContentDeserializer;-><init>(Lo/getCreatedOnDateMs;)V

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_28
    return-void
.end method

###### Class kotlin.getContentDeserializer (o.getContentDeserializer)
.class public final synthetic Lo/getContentDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Lo/getCreatedOnDateMs;


# direct methods
.method public synthetic constructor <init>(Lo/getCreatedOnDateMs;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getContentDeserializer;->write:Lo/getCreatedOnDateMs;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getContentDeserializer;->write:Lo/getCreatedOnDateMs;

    invoke-static {p0}, Landroidx/compose/ui/window/PopupLayout$1;->AudioAttributesCompatParcelizer(Lo/getCreatedOnDateMs;)V

    return-void
.end method

###### Class androidx.compose.ui.window.PopupLayout.AnonymousClass2 (androidx.compose.ui.window.PopupLayout$2)
.class final Landroidx/compose/ui/window/PopupLayout$2;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatCustomActionResultReceiver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "read",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $IconCompatParcelizer:Lo/appendReferring;

.field final synthetic $RemoteActionCompatParcelizer:J

.field final synthetic $read:J

.field final synthetic $write:Lo/MagicModuleUseCaseImplWhenMappings$read;

.field final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;


# direct methods
.method constructor <init>(Lo/MagicModuleUseCaseImplWhenMappings$read;Landroidx/compose/ui/window/PopupLayout;Lo/appendReferring;JJ)V
    .registers 8

    .line 794
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout$2;->$write:Lo/MagicModuleUseCaseImplWhenMappings$read;

    iput-object p2, p0, Landroidx/compose/ui/window/PopupLayout$2;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout$2;->$IconCompatParcelizer:Lo/appendReferring;

    iput-wide p4, p0, Landroidx/compose/ui/window/PopupLayout$2;->$read:J

    iput-wide p6, p0, Landroidx/compose/ui/window/PopupLayout$2;->$RemoteActionCompatParcelizer:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 787
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout$2;->read()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read()V
    .registers 10

    .line 788
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout$2;->$write:Lo/MagicModuleUseCaseImplWhenMappings$read;

    .line 789
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout$2;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;

    invoke-virtual {v1}, Landroidx/compose/ui/window/PopupLayout;->getPositionProvider()Lo/DateDeserializersCalendarDeserializer;

    move-result-object v2

    .line 790
    iget-object v3, p0, Landroidx/compose/ui/window/PopupLayout$2;->$IconCompatParcelizer:Lo/appendReferring;

    .line 791
    iget-wide v4, p0, Landroidx/compose/ui/window/PopupLayout$2;->$read:J

    .line 792
    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout$2;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/window/PopupLayout;

    invoke-virtual {v1}, Landroidx/compose/ui/window/PopupLayout;->getParentLayoutDirection()Lo/tryToResolveUnresolved;

    move-result-object v6

    .line 793
    iget-wide v7, p0, Landroidx/compose/ui/window/PopupLayout$2;->$RemoteActionCompatParcelizer:J

    .line 789
    invoke-interface/range {v2 .. v8}, Lo/DateDeserializersCalendarDeserializer;->AudioAttributesCompatParcelizer(Lo/appendReferring;JLo/tryToResolveUnresolved;J)J

    move-result-wide v1

    .line 788
    iput-wide v1, v0, Lo/MagicModuleUseCaseImplWhenMappings$read;->IconCompatParcelizer:J

    return-void
.end method

###### Class androidx.compose.ui.window.PopupLayout.AnonymousClass3 (androidx.compose.ui.window.PopupLayout$3)
.class final Landroidx/compose/ui/window/PopupLayout$3;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/window/PopupLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Landroidx/compose/ui/window/PopupLayout;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/window/PopupLayout;",
        "p0",
        "",
        "RemoteActionCompatParcelizer",
        "(Landroidx/compose/ui/window/PopupLayout;)V"
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
.field public static final write:Landroidx/compose/ui/window/PopupLayout$3;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 891
    new-instance v0, Landroidx/compose/ui/window/PopupLayout$3;

    invoke-direct {v0}, Landroidx/compose/ui/window/PopupLayout$3;-><init>()V

    sput-object v0, Landroidx/compose/ui/window/PopupLayout$3;->write:Landroidx/compose/ui/window/PopupLayout$3;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x1

    .line 892
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroidx/compose/ui/window/PopupLayout;)V
    .registers 2

    .line 889
    invoke-virtual {p1}, Landroidx/compose/ui/window/PopupLayout;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_9

    .line 890
    invoke-virtual {p1}, Landroidx/compose/ui/window/PopupLayout;->MediaBrowserCompatCustomActionResultReceiver()V

    :cond_9
    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 888
    check-cast p1, Landroidx/compose/ui/window/PopupLayout;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout$3;->RemoteActionCompatParcelizer(Landroidx/compose/ui/window/PopupLayout;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.window.PopupLayout.AnonymousClass4 (androidx.compose.ui.window.PopupLayout$4)
.class final Landroidx/compose/ui/window/PopupLayout$4;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/PopupLayout;-><init>(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "AudioAttributesCompatParcelizer",
        "()Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic read:Landroidx/compose/ui/window/PopupLayout;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/PopupLayout;)V
    .registers 2

    .line 517
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout$4;->read:Landroidx/compose/ui/window/PopupLayout;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/Boolean;
    .registers 3

    .line 516
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout$4;->read:Landroidx/compose/ui/window/PopupLayout;

    invoke-static {v0}, Landroidx/compose/ui/window/PopupLayout;->RemoteActionCompatParcelizer(Landroidx/compose/ui/window/PopupLayout;)Lo/isAbstract;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, Lo/isAbstract;->MediaBrowserCompatItemReceiver()Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    const/4 v0, 0x0

    :cond_f
    if-eqz v0, :cond_1b

    iget-object p0, p0, Landroidx/compose/ui/window/PopupLayout$4;->read:Landroidx/compose/ui/window/PopupLayout;

    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->getPopupContentSize-bOM6tXw()Lo/getKey;

    move-result-object p0

    if-eqz p0, :cond_1b

    const/4 p0, 0x1

    goto :goto_1c

    :cond_1b
    const/4 p0, 0x0

    :goto_1c
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 515
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout$4;->AudioAttributesCompatParcelizer()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.ui.window.PopupLayout.AnonymousClass5 (androidx.compose.ui.window.PopupLayout$5)
.class public final Landroidx/compose/ui/window/PopupLayout$5;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/PopupLayout;-><init>(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;)V
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
        "Landroidx/compose/ui/window/PopupLayout$5;",
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

    .line 563
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 4

    .line 565
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v0, p0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    const/4 p0, 0x0

    .line 570
    invoke-virtual {p2, p0}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void
.end method

###### Class androidx.compose.ui.window.PopupLayout.AudioAttributesCompatParcelizer (androidx.compose.ui.window.PopupLayout$AudioAttributesCompatParcelizer)
.class final Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/window/PopupLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/window/PopupLayout;",
        "",
        "read",
        "Lo/getAnswerMap;",
        "IconCompatParcelizer"
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

    .line 887
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 888
    invoke-direct {p0}, Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

###### Class androidx.compose.ui.window.PopupLayout.IconCompatParcelizer (androidx.compose.ui.window.PopupLayout$IconCompatParcelizer)
.class final Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/PopupLayout;->IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/MagicModuleSubmissionRequestBody<",
        "Lo/_handleUnrecognizedCharacterEscape;",
        "Ljava/lang/Integer;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic read:Landroidx/compose/ui/window/PopupLayout;

.field final synthetic write:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/PopupLayout;I)V
    .registers 3

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;->read:Landroidx/compose/ui/window/PopupLayout;

    iput p2, p0, Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;->write:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;->read(Lo/_handleUnrecognizedCharacterEscape;I)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read(Lo/_handleUnrecognizedCharacterEscape;I)V
    .registers 3

    .line 3
    iget-object p2, p0, Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;->read:Landroidx/compose/ui/window/PopupLayout;

    iget p0, p0, Landroidx/compose/ui/window/PopupLayout$IconCompatParcelizer;->write:I

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lo/_appendEscaped;->RemoteActionCompatParcelizer(I)I

    move-result p0

    invoke-virtual {p2, p1, p0}, Landroidx/compose/ui/platform/AbstractComposeView;->IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V

    return-void
.end method

###### Class androidx.compose.ui.window.PopupLayout.RemoteActionCompatParcelizer.WhenMappings (androidx.compose.ui.window.PopupLayout$RemoteActionCompatParcelizer$WhenMappings)
.class public final synthetic Landroidx/compose/ui/window/PopupLayout$RemoteActionCompatParcelizer$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/window/PopupLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic write:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    invoke-static {}, Lo/tryToResolveUnresolved;->values()[Lo/tryToResolveUnresolved;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v1, Lo/tryToResolveUnresolved;->write:Lo/tryToResolveUnresolved;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_10} :catch_10

    :catch_10
    :try_start_10
    sget-object v1, Lo/tryToResolveUnresolved;->RemoteActionCompatParcelizer:Lo/tryToResolveUnresolved;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_19} :catch_19

    :catch_19
    sput-object v0, Landroidx/compose/ui/window/PopupLayout$RemoteActionCompatParcelizer$WhenMappings;->write:[I

    return-void
.end method
