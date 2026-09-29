###### Class androidx.compose.ui.tooling.ComposeViewAdapter (androidx.compose.ui.tooling.ComposeViewAdapter)
.class public final Landroidx/compose/ui/tooling/ComposeViewAdapter;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B!\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\nJ=\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000c2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J7\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u000f\u0010\u0010\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0014J\u0013\u0010\u001c\u001a\u00020\u0015*\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010\u001c\u001a\u0004\u0018\u00010#*\u00020\"H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010$J%\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008 \u0010%J\u0017\u0010\'\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020&H\u0014\u00a2\u0006\u0004\u0008\'\u0010(J\u001d\u0010\u0010\u001a\u00020\u00122\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00120)H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010*J\u0095\u0001\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001f2\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030,\u0018\u00010+2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010-\u001a\u00020\u00152\u0008\u0008\u0002\u0010/\u001a\u00020.2\u0008\u0008\u0002\u00100\u001a\u00020\u00152\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\u000e\u0008\u0002\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00120)2\u000e\u0008\u0002\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00120)H\u0000\u00a2\u0006\u0004\u0008\u0010\u00104J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001a\u00105R\u0014\u0010\u0010\u001a\u00020\u001f8\u0002X\u0083D\u00a2\u0006\u0006\n\u0004\u0008\u0010\u00106R\u0014\u0010 \u001a\u0002078\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010;R(\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0001@\u0001X\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR(\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\r8\u0001@\u0001X\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u0010>\u001a\u0004\u0008D\u0010@\"\u0004\u0008E\u0010BR\u0014\u0010I\u001a\u00020F8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0016\u0010:\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u00106R\u0016\u0010<\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010;R\u0014\u00108\u001a\u00020L8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u001c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120)8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0016\u0010J\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010;R\u0016\u0010R\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008R\u00106R\u001c\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00120)8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010K\u001a\u00020U8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010VR\"\u0010X\u001a\u00020W8\u0001@\u0001X\u0081.\u00a2\u0006\u0012\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[\"\u0004\u0008\\\u0010]R\u0014\u0010M\u001a\u00020^8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010_R\u0014\u0010Q\u001a\u00020`8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010aR\u0014\u0010d\u001a\u00020b8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010f"
    }
    d2 = {
        "Landroidx/compose/ui/tooling/ComposeViewAdapter;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "p0",
        "Landroid/util/AttributeSet;",
        "p1",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "p2",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lo/JsonReadFeature;",
        "Lo/PropertyBasedObjectIdGenerator;",
        "",
        "Lo/complete;",
        "p3",
        "write",
        "(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;",
        "",
        "AudioAttributesImplApi21Parcelizer",
        "()V",
        "",
        "p4",
        "onLayout",
        "(ZIIII)V",
        "onAttachedToWindow",
        "IconCompatParcelizer",
        "Lo/ObjectIdReferenceProperty;",
        "read",
        "(Lo/ObjectIdReferenceProperty;)Z",
        "Lo/appendReferring;",
        "",
        "RemoteActionCompatParcelizer",
        "(Lo/ObjectIdReferenceProperty;Lo/appendReferring;)Ljava/lang/String;",
        "",
        "Ljava/lang/reflect/Method;",
        "(Ljava/lang/Object;)Ljava/lang/reflect/Method;",
        "(Ljava/lang/Object;II)Ljava/lang/String;",
        "Landroid/graphics/Canvas;",
        "dispatchDraw",
        "(Landroid/graphics/Canvas;)V",
        "Lkotlin/Function0;",
        "(Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V",
        "Ljava/lang/Class;",
        "Lo/PropertyValueMap;",
        "p5",
        "",
        "p6",
        "p7",
        "p8",
        "p9",
        "p10",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZLjava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V",
        "(Landroid/util/AttributeSet;)V",
        "Ljava/lang/String;",
        "Landroidx/compose/ui/platform/ComposeView;",
        "MediaBrowserCompatItemReceiver",
        "Landroidx/compose/ui/platform/ComposeView;",
        "AudioAttributesImplBaseParcelizer",
        "Z",
        "AudioAttributesImplApi26Parcelizer",
        "viewInfos",
        "Ljava/util/List;",
        "getViewInfos$ui_tooling",
        "()Ljava/util/List;",
        "setViewInfos$ui_tooling",
        "(Ljava/util/List;)V",
        "designInfoList",
        "getDesignInfoList$ui_tooling",
        "setDesignInfoList$ui_tooling",
        "Lo/hasDelegatingCreator;",
        "onCustomAction",
        "Lo/hasDelegatingCreator;",
        "AudioAttributesCompatParcelizer",
        "MediaBrowserCompatCustomActionResultReceiver",
        "MediaBrowserCompatMediaItem",
        "Lo/handleTypePropertyValue;",
        "MediaBrowserCompatSearchResultReceiver",
        "Lo/handleTypePropertyValue;",
        "onAddQueueItem",
        "Lo/MagicModuleSubmissionRequestBody;",
        "MediaMetadataCompat",
        "RatingCompat",
        "MediaDescriptionCompat",
        "Lo/getCreatedOnDateMs;",
        "Landroid/graphics/Paint;",
        "Landroid/graphics/Paint;",
        "Lo/JavaUtilCollectionsDeserializers;",
        "clock",
        "Lo/JavaUtilCollectionsDeserializers;",
        "getClock$ui_tooling",
        "()Lo/JavaUtilCollectionsDeserializers;",
        "setClock$ui_tooling",
        "(Lo/JavaUtilCollectionsDeserializers;)V",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$read;",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$read;",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$write;",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$write;",
        "onCommand"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

.field private final AudioAttributesImplApi21Parcelizer:Landroid/graphics/Paint;

.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Z

.field private final IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$write;

.field private MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private final MediaBrowserCompatItemReceiver:Landroidx/compose/ui/platform/ComposeView;

.field private MediaBrowserCompatMediaItem:Z

.field private final MediaBrowserCompatSearchResultReceiver:Lo/handleTypePropertyValue;

.field private MediaDescriptionCompat:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private MediaMetadataCompat:Z

.field private RatingCompat:Ljava/lang/String;

.field private final RemoteActionCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;

.field public clock:Lo/JavaUtilCollectionsDeserializers;

.field private designInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private onAddQueueItem:Lo/MagicModuleSubmissionRequestBody;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/MagicModuleSubmissionRequestBody<",
            "-",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "-",
            "Ljava/lang/Integer;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final onCustomAction:Lo/hasDelegatingCreator;

.field private final read:Landroidx/compose/ui/tooling/ComposeViewAdapter$read;

.field private viewInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/complete;",
            ">;"
        }
    .end annotation
.end field

.field private final write:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 9

    .line 190
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 129
    const-string p1, "ComposeViewAdapter"

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write:Ljava/lang/String;

    .line 132
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatItemReceiver:Landroidx/compose/ui/platform/ComposeView;

    .line 142
    invoke-static {}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->viewInfos:Ljava/util/List;

    .line 143
    invoke-static {}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->designInfoList:Ljava/util/List;

    .line 144
    sget-object p1, Lo/hasDelegatingCreator;->IconCompatParcelizer:Lo/hasDelegatingCreator$IconCompatParcelizer;

    invoke-virtual {p1}, Lo/hasDelegatingCreator$IconCompatParcelizer;->IconCompatParcelizer()Lo/hasDelegatingCreator;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onCustomAction:Lo/hasDelegatingCreator;

    .line 147
    const-string p1, ""

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 157
    new-instance v0, Lo/handleTypePropertyValue;

    invoke-direct {v0}, Lo/handleTypePropertyValue;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatSearchResultReceiver:Lo/handleTypePropertyValue;

    .line 163
    sget-object v0, Lo/findImplicitParamName;->read:Lo/findImplicitParamName;

    invoke-virtual {v0}, Lo/findImplicitParamName;->IconCompatParcelizer()Lo/MagicModuleSubmissionRequestBody;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onAddQueueItem:Lo/MagicModuleSubmissionRequestBody;

    .line 176
    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RatingCompat:Ljava/lang/String;

    .line 179
    new-instance p1, Lo/_computeDelegateType;

    invoke-direct {p1}, Lo/_computeDelegateType;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaDescriptionCompat:Lo/getCreatedOnDateMs;

    .line 182
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    const/4 v0, 0x4

    .line 183
    new-array v0, v0, [F

    fill-array-data v0, :array_92

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    check-cast v1, Landroid/graphics/PathEffect;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 184
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 185
    sget-object v0, Lo/switchToNext;->AudioAttributesCompatParcelizer:Lo/switchToNext$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lo/switchToNext$AudioAttributesCompatParcelizer;->read()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/RequestPayload;->IconCompatParcelizer(J)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 182
    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Paint;

    .line 591
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    invoke-direct {p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    .line 608
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;

    .line 615
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;

    invoke-direct {p1, p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;-><init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;)V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read:Landroidx/compose/ui/tooling/ComposeViewAdapter$read;

    .line 623
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$write;

    invoke-direct {p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter$write;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$write;

    .line 191
    invoke-direct {p0, p2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void

    nop

    :array_92
    .array-data 4
        0x40a00000    # 5.0f
        0x41200000    # 10.0f
        0x41700000    # 15.0f
        0x41a00000    # 20.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 10

    .line 198
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 129
    const-string p1, "ComposeViewAdapter"

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write:Ljava/lang/String;

    .line 132
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatItemReceiver:Landroidx/compose/ui/platform/ComposeView;

    .line 142
    invoke-static {}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->viewInfos:Ljava/util/List;

    .line 143
    invoke-static {}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->designInfoList:Ljava/util/List;

    .line 144
    sget-object p1, Lo/hasDelegatingCreator;->IconCompatParcelizer:Lo/hasDelegatingCreator$IconCompatParcelizer;

    invoke-virtual {p1}, Lo/hasDelegatingCreator$IconCompatParcelizer;->IconCompatParcelizer()Lo/hasDelegatingCreator;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onCustomAction:Lo/hasDelegatingCreator;

    .line 147
    const-string p1, ""

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 157
    new-instance p3, Lo/handleTypePropertyValue;

    invoke-direct {p3}, Lo/handleTypePropertyValue;-><init>()V

    iput-object p3, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatSearchResultReceiver:Lo/handleTypePropertyValue;

    .line 163
    sget-object p3, Lo/findImplicitParamName;->read:Lo/findImplicitParamName;

    invoke-virtual {p3}, Lo/findImplicitParamName;->IconCompatParcelizer()Lo/MagicModuleSubmissionRequestBody;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onAddQueueItem:Lo/MagicModuleSubmissionRequestBody;

    .line 176
    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RatingCompat:Ljava/lang/String;

    .line 179
    new-instance p1, Lo/_computeDelegateType;

    invoke-direct {p1}, Lo/_computeDelegateType;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaDescriptionCompat:Lo/getCreatedOnDateMs;

    .line 182
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    const/4 p3, 0x4

    .line 183
    new-array p3, p3, [F

    fill-array-data p3, :array_92

    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x0

    invoke-direct {v0, p3, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    check-cast v0, Landroid/graphics/PathEffect;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 184
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 185
    sget-object p3, Lo/switchToNext;->AudioAttributesCompatParcelizer:Lo/switchToNext$AudioAttributesCompatParcelizer;

    invoke-virtual {p3}, Lo/switchToNext$AudioAttributesCompatParcelizer;->read()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/RequestPayload;->IconCompatParcelizer(J)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 182
    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Paint;

    .line 591
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    invoke-direct {p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    .line 608
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;

    .line 615
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;

    invoke-direct {p1, p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;-><init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;)V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read:Landroidx/compose/ui/tooling/ComposeViewAdapter$read;

    .line 623
    new-instance p1, Landroidx/compose/ui/tooling/ComposeViewAdapter$write;

    invoke-direct {p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter$write;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$write;

    .line 199
    invoke-direct {p0, p2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void

    nop

    :array_92
    .array-data 4
        0x40a00000    # 5.0f
        0x41200000    # 10.0f
        0x41700000    # 15.0f
        0x41a00000    # 20.0f
    .end array-data
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;
    .registers 5

    .line 126
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic AudioAttributesCompatParcelizer()Lo/getShowPopup;
    .registers 1

    .line 699
    invoke-static {}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatItemReceiver()Lo/getShowPopup;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;
    .registers 6

    .line 706
    invoke-static/range {p0 .. p5}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method private final AudioAttributesImplApi21Parcelizer()V
    .registers 9

    .line 264
    iget-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onCustomAction:Lo/hasDelegatingCreator;

    invoke-interface {v0}, Lo/hasDelegatingCreator;->write()Ljava/util/Set;

    move-result-object v1

    new-instance v2, Lo/addBigDecimalCreator;

    invoke-direct {v2}, Lo/addBigDecimalCreator;-><init>()V

    .line 266
    new-instance v0, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesImplBaseParcelizer;

    invoke-direct {v0, p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesImplBaseParcelizer;-><init>(Ljava/lang/Object;)V

    move-object v3, v0

    check-cast v3, Lo/getMagicModuleStat;

    new-instance v4, Lo/addBooleanCreator;

    invoke-direct {v4}, Lo/addBooleanCreator;-><init>()V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    .line 264
    invoke-static/range {v1 .. v7}, Lo/ObjectIdValueProperty;->IconCompatParcelizer$default(Ljava/util/Set;Lo/getAnswerMap;Lo/getMagicModuleStat;Lo/getModuleData;Lo/PropertyBasedCreator;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 263
    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->viewInfos:Ljava/util/List;

    .line 270
    iget-boolean p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p0, :cond_2c

    const/4 p0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    .line 271
    invoke-static {v0, p0, v2, v1, v2}, Lo/addExternal;->AudioAttributesCompatParcelizer$default(Ljava/util/List;ILo/getAnswerMap;ILjava/lang/Object;)Ljava/lang/String;

    :cond_2c
    return-void
.end method

.method private static final AudioAttributesImplApi26Parcelizer()Lo/getShowPopup;
    .registers 1

    .line 454
    sget-object v0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object v0
.end method

.method public static synthetic IconCompatParcelizer(Lo/setCurrentName;Lo/complete;Ljava/util/List;)Lo/complete;
    .registers 3

    .line 704
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Lo/setCurrentName;Lo/complete;Ljava/util/List;)Lo/complete;

    move-result-object p0

    return-object p0
.end method

.method private static final IconCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;ILo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 5

    or-int/lit8 p2, p2, 0x1

    .line 709
    invoke-static {p2}, Lo/_appendEscaped;->RemoteActionCompatParcelizer(I)I

    move-result p2

    invoke-direct {p0, p1, p3, p2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method private static final IconCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;JLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 22

    move-object/from16 v7, p4

    move-object/from16 v8, p7

    move/from16 v0, p8

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_d

    const/4 v1, 0x1

    goto :goto_e

    :cond_d
    const/4 v1, 0x0

    :goto_e
    and-int/lit8 v2, v0, 0x1

    invoke-interface {v8, v1, v2}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v1

    if-eqz v1, :cond_b0

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v1

    if-eqz v1, :cond_25

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:468)"

    const v3, -0x4e1ab2db

    invoke-static {v3, v0, v1, v2}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    :cond_25
    move-object v1, p0

    .line 475
    invoke-interface {v8, p0}, Lo/_handleUnrecognizedCharacterEscape;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z

    move-result v0

    move-object v2, p1

    invoke-interface {v8, p1}, Lo/_handleUnrecognizedCharacterEscape;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v8, v8}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v4

    move-object v5, p2

    invoke-interface {v8, p2}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v6

    move/from16 v9, p3

    invoke-interface {v8, v9}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(I)Z

    move-result v10

    invoke-interface {v8, v7}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v11

    .line 687
    invoke-interface/range {p7 .. p7}, Lo/_handleUnrecognizedCharacterEscape;->onPause()Ljava/lang/Object;

    move-result-object v12

    or-int/2addr v0, v3

    or-int/2addr v0, v4

    or-int/2addr v0, v6

    or-int/2addr v0, v10

    or-int/2addr v0, v11

    if-nez v0, :cond_55

    .line 688
    sget-object v0, Lo/_handleUnrecognizedCharacterEscape;->write:Lo/_handleUnrecognizedCharacterEscape$write;

    invoke-virtual {v0}, Lo/_handleUnrecognizedCharacterEscape$write;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    if-ne v12, v0, :cond_67

    .line 475
    :cond_55
    new-instance v12, Lo/addLongCreator;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p7

    move-object v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lo/addLongCreator;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;)V

    .line 690
    invoke-interface {v8, v12}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(Ljava/lang/Object;)V

    .line 475
    :cond_67
    check-cast v12, Lo/getCreatedOnDateMs;

    const-wide/16 v0, 0x0

    cmp-long v0, p5, v0

    if-ltz v0, :cond_9a

    const v0, -0x14dab540

    .line 498
    invoke-interface {v8, v0}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(I)V

    .line 504
    invoke-interface {v8, v7}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v0

    .line 693
    invoke-interface/range {p7 .. p7}, Lo/_handleUnrecognizedCharacterEscape;->onPause()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_87

    .line 694
    sget-object v0, Lo/_handleUnrecognizedCharacterEscape;->write:Lo/_handleUnrecognizedCharacterEscape$write;

    invoke-virtual {v0}, Lo/_handleUnrecognizedCharacterEscape$write;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_8f

    .line 504
    :cond_87
    new-instance v1, Lo/addDelegatingCreator;

    invoke-direct {v1, v7}, Lo/addDelegatingCreator;-><init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;)V

    .line 696
    invoke-interface {v8, v1}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(Ljava/lang/Object;)V

    .line 504
    :cond_8f
    check-cast v1, Lo/getCreatedOnDateMs;

    new-instance v0, Lo/JavaUtilCollectionsDeserializers;

    invoke-direct {v0, v1}, Lo/JavaUtilCollectionsDeserializers;-><init>(Lo/getCreatedOnDateMs;)V

    invoke-virtual {v7, v0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->setClock$ui_tooling(Lo/JavaUtilCollectionsDeserializers;)V

    goto :goto_a0

    :cond_9a
    const v0, -0x160cf3e3

    .line 498
    invoke-interface {v8, v0}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(I)V

    :goto_a0
    invoke-interface/range {p7 .. p7}, Lo/_handleUnrecognizedCharacterEscape;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 518
    invoke-interface {v12}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_b3

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_b3

    .line 468
    :cond_b0
    invoke-interface/range {p7 .. p7}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 519
    :cond_b3
    :goto_b3
    sget-object v0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object v0
.end method

.method private static final IconCompatParcelizer(Lo/getCreatedOnDateMs;Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IJLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 24

    move-object/from16 v0, p8

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_d

    move v2, v5

    goto :goto_e

    :cond_d
    move v2, v4

    :goto_e
    and-int/lit8 v3, v1, 0x1

    invoke-interface {v0, v2, v3}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v2

    if-eqz v2, :cond_54

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v2

    if-eqz v2, :cond_25

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:465)"

    const v6, -0x273cd64e

    invoke-static {v6, v1, v2, v3}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    :cond_25
    move-object v1, p0

    .line 466
    invoke-static {p0, v0, v4}, Lo/StreamReadException;->write(Lo/getCreatedOnDateMs;Lo/_handleUnrecognizedCharacterEscape;I)V

    .line 468
    new-instance v1, Lo/_reportDuplicateCreator;

    move-object v6, v1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v10, p5

    move-object v11, p1

    move-wide/from16 v12, p6

    invoke-direct/range {v6 .. v13}, Lo/_reportDuplicateCreator;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;J)V

    const/16 v2, 0x36

    const v3, -0x4e1ab2db

    invoke-static {v3, v5, v1, v0, v2}, Lo/multiplyFft;->AudioAttributesCompatParcelizer(IZLjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/FastIntegerMathUInt128;

    move-result-object v1

    check-cast v1, Lo/MagicModuleSubmissionRequestBody;

    const/4 v2, 0x6

    move-object v3, p1

    invoke-direct {p1, v1, v0, v2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_57

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_57

    .line 465
    :cond_54
    invoke-interface/range {p8 .. p8}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 520
    :cond_57
    :goto_57
    sget-object v0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object v0
.end method

.method private final IconCompatParcelizer()V
    .registers 6

    .line 302
    iget-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onCustomAction:Lo/hasDelegatingCreator;

    invoke-interface {v0}, Lo/hasDelegatingCreator;->write()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 645
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 646
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 647
    check-cast v2, Lo/JsonReadContext;

    .line 302
    invoke-static {v2}, Lo/startBuilding;->IconCompatParcelizer(Lo/JsonReadContext;)Lo/ObjectIdReferenceProperty;

    move-result-object v2

    .line 647
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 648
    :cond_2d
    check-cast v1, Ljava/util/List;

    .line 303
    iget-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->clock:Lo/JavaUtilCollectionsDeserializers;

    if-eqz v0, :cond_35

    const/4 v0, 0x1

    goto :goto_36

    :cond_35
    const/4 v0, 0x0

    .line 304
    :goto_36
    new-instance v2, Lo/getTypeProperty;

    new-instance v3, Landroidx/compose/ui/tooling/ComposeViewAdapter$RemoteActionCompatParcelizer;

    invoke-direct {v3, p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$RemoteActionCompatParcelizer;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lo/getCreatedOnDateMs;

    new-instance v4, Landroidx/compose/ui/tooling/ComposeViewAdapter$MediaBrowserCompatItemReceiver;

    invoke-direct {v4, p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$MediaBrowserCompatItemReceiver;-><init>(Ljava/lang/Object;)V

    check-cast v4, Lo/getCreatedOnDateMs;

    invoke-direct {v2, v3, v4}, Lo/getTypeProperty;-><init>(Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V

    .line 305
    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Lo/getTypeProperty;->write(Ljava/util/Collection;)Z

    move-result v3

    iput-boolean v3, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_58

    if-eqz v3, :cond_58

    .line 307
    invoke-virtual {v2, v1}, Lo/getTypeProperty;->read(Ljava/util/Collection;)V

    :cond_58
    return-void
.end method

.method private final IconCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 546
    move-object v2, v0

    check-cast v2, Landroid/view/View;

    iget-object v3, v0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    check-cast v3, Lo/hasGetter;

    invoke-static {v2, v3}, Lo/isCreatorVisible;->IconCompatParcelizer(Landroid/view/View;Lo/hasGetter;)V

    .line 547
    iget-object v3, v0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    check-cast v3, Lo/PieChart;

    invoke-static {v2, v3}, Lo/setCenterTextRadiusPercent;->read(Landroid/view/View;Lo/PieChart;)V

    .line 548
    iget-object v3, v0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;

    check-cast v3, Lo/TypeResolutionContext;

    invoke-static {v2, v3}, Lo/isFieldVisible;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/TypeResolutionContext;)V

    .line 549
    iget-object v2, v0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatItemReceiver:Landroidx/compose/ui/platform/ComposeView;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 551
    const-string v2, "composableName"

    const-string v3, "http://schemas.android.com/tools"

    invoke-interface {v1, v3, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2e

    return-void

    :cond_2e
    const/16 v4, 0x2e

    .line 552
    invoke-static {v2, v4}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v5

    .line 553
    invoke-static {v2, v4}, Lo/TestGroupLSModel;->RemoteActionCompatParcelizer(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    .line 555
    const-string v4, "parameterProviderIndex"

    const/4 v6, 0x0

    invoke-interface {v1, v3, v4, v6}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v4

    .line 558
    const-string v6, "parameterProviderClass"

    invoke-interface {v1, v3, v6}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4c

    .line 559
    invoke-static {v6}, Lo/_deserializeMissingToken;->read(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    goto :goto_4d

    :cond_4c
    const/4 v6, 0x0

    .line 563
    :goto_4d
    :try_start_4d
    const-string v7, "animationClockStartTime"

    invoke-interface {v1, v3, v7}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_4d .. :try_end_57} :catch_58

    goto :goto_5a

    :catch_58
    const-wide/16 v7, -0x1

    .line 574
    :goto_5a
    const-string v9, "paintBounds"

    iget-boolean v10, v0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi26Parcelizer:Z

    invoke-interface {v1, v3, v9, v10}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    .line 576
    const-string v10, "printViewInfos"

    iget-boolean v11, v0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplBaseParcelizer:Z

    invoke-interface {v1, v3, v10, v11}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    .line 582
    iget-boolean v11, v0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaMetadataCompat:Z

    .line 579
    const-string v12, "findDesignInfoProviders"

    invoke-interface {v1, v3, v12, v11}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    .line 585
    const-string v12, "designInfoProvidersArgument"

    invoke-interface {v1, v3, v12}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x600

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object v1, v5

    move-object v3, v6

    move v5, v9

    move v6, v10

    move v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object v12, v14

    move v13, v15

    move-object/from16 v14, v16

    .line 568
    invoke-static/range {v0 .. v14}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write$default(Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZLjava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;ILjava/lang/Object;)V

    return-void
.end method

.method private static final MediaBrowserCompatCustomActionResultReceiver()Lo/getShowPopup;
    .registers 1

    .line 455
    sget-object v0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object v0
.end method

.method private static final MediaBrowserCompatItemReceiver()Lo/getShowPopup;
    .registers 1

    .line 179
    sget-object v0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object v0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;)Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;
    .registers 1

    .line 126
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    return-object p0
.end method

.method private final RemoteActionCompatParcelizer(Ljava/lang/Object;II)Ljava/lang/String;
    .registers 8

    .line 364
    invoke-direct {p0, p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_34

    .line 367
    :try_start_7
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RatingCompat:Ljava/lang/String;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, v2, p3

    const/4 p2, 0x2

    aput-object p0, v2, p2

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 368
    const-string p1, ""

    invoke-static {p0, p1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/String;

    check-cast p0, Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_31

    move-object p0, v1

    :cond_31
    check-cast p0, Ljava/lang/String;
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_33} :catch_34

    move-object v1, p0

    :catch_34
    :cond_34
    return-object v1
.end method

.method private final RemoteActionCompatParcelizer(Lo/ObjectIdReferenceProperty;Lo/appendReferring;)Ljava/lang/String;
    .registers 6

    .line 342
    invoke-virtual {p1}, Lo/ObjectIdReferenceProperty;->RemoteActionCompatParcelizer()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_26

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {p2}, Lo/appendReferring;->RemoteActionCompatParcelizer()I

    move-result v1

    invoke-virtual {p2}, Lo/appendReferring;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :cond_24
    if-eqz v1, :cond_a

    :cond_26
    return-object v1
.end method

.method public static synthetic RemoteActionCompatParcelizer()Lo/getShowPopup;
    .registers 1

    .line 697
    invoke-static {}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatCustomActionResultReceiver()Lo/getShowPopup;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;ILo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 5

    .line 707
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;ILo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 4

    .line 701
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;JLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 9

    .line 703
    invoke-static/range {p0 .. p8}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;JLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method private static final RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/ObjectIdReferenceProperty;)Z
    .registers 5

    .line 323
    invoke-virtual {p1}, Lo/ObjectIdReferenceProperty;->AudioAttributesImplApi26Parcelizer()Ljava/lang/String;

    move-result-object v0

    const-string v1, "remember"

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    invoke-direct {p0, p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Lo/ObjectIdReferenceProperty;)Z

    move-result v0

    if-nez v0, :cond_45

    .line 324
    :cond_12
    invoke-virtual {p1}, Lo/ObjectIdReferenceProperty;->read()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 684
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_25

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_47

    .line 685
    :cond_25
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_29
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_47

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ObjectIdReferenceProperty;

    .line 325
    invoke-virtual {v0}, Lo/ObjectIdReferenceProperty;->AudioAttributesImplApi26Parcelizer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-direct {p0, v0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Lo/ObjectIdReferenceProperty;)Z

    move-result v0

    if-eqz v0, :cond_29

    :cond_45
    const/4 p0, 0x1

    return p0

    :cond_47
    const/4 p0, 0x0

    return p0
.end method

.method private final read(Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .registers 4

    .line 351
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const/4 p1, 0x3

    .line 353
    new-array p1, p1, [Ljava/lang/Class;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    .line 354
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x1

    aput-object v0, p1, v1

    .line 355
    const-class v0, Ljava/lang/String;

    const/4 v1, 0x2

    aput-object v0, p1, v1

    .line 351
    const-string v0, "getDesignInfo"

    invoke-virtual {p0, v0, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_1c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_1c} :catch_1d

    return-object p0

    :catch_1d
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final read(Lo/setCurrentName;Lo/complete;Ljava/util/List;)Lo/complete;
    .registers 3

    return-object p1
.end method

.method public static synthetic read()Lo/getShowPopup;
    .registers 1

    .line 700
    invoke-static {}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi26Parcelizer()Lo/getShowPopup;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic read(Landroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;
    .registers 1

    .line 705
    invoke-static {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Landroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method private static final read(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 8

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    move v0, v2

    :goto_9
    and-int/lit8 v1, p3, 0x1

    invoke-interface {p2, v0, v1}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:416)"

    const v3, -0x3424f847    # -2.8708722E7f

    invoke-static {v3, p3, v0, v1}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 417
    :cond_20
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onCustomAction:Lo/hasDelegatingCreator;

    invoke-static {p0, p1, p2, v2}, Lo/addStringCreator;->write(Lo/hasDelegatingCreator;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result p0

    if-eqz p0, :cond_32

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_32

    .line 416
    :cond_2f
    invoke-interface {p2}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 418
    :cond_32
    :goto_32
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method private static final read(Lo/setCurrentName;)Lo/getShowPopup;
    .registers 1

    .line 265
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method private final read(Lo/ObjectIdReferenceProperty;)Z
    .registers 4

    .line 339
    invoke-virtual {p1}, Lo/ObjectIdReferenceProperty;->RemoteActionCompatParcelizer()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 672
    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_15

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    return v1

    .line 673
    :cond_15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2a

    .line 339
    invoke-direct {p0, v0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_2b

    :cond_2a
    const/4 v0, 0x0

    :goto_2b
    if-eqz v0, :cond_19

    const/4 p0, 0x1

    return p0

    :cond_2f
    return v1
.end method

.method private final write(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/JsonReadFeature;",
            "Lo/PropertyBasedObjectIdGenerator;",
            "Ljava/util/List<",
            "Lo/complete;",
            ">;",
            "Ljava/util/List<",
            "Lo/complete;",
            ">;)",
            "Lo/complete;"
        }
    .end annotation

    if-eqz p4, :cond_a

    .line 248
    check-cast p3, Ljava/util/Collection;

    check-cast p4, Ljava/lang/Iterable;

    invoke-static {p3, p4}, Lo/IntermediateLoginResponseBody;->AudioAttributesCompatParcelizer(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    :cond_a
    move-object v5, p3

    .line 251
    invoke-interface {p2}, Lo/PropertyBasedObjectIdGenerator;->write()Lo/PropertyBasedCreatorCaseInsensitiveMap;

    move-result-object p0

    if-eqz p0, :cond_17

    invoke-virtual {p0}, Lo/PropertyBasedCreatorCaseInsensitiveMap;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_19

    :cond_17
    const-string p0, ""

    :cond_19
    move-object v1, p0

    .line 252
    invoke-interface {p2}, Lo/PropertyBasedObjectIdGenerator;->write()Lo/PropertyBasedCreatorCaseInsensitiveMap;

    move-result-object p0

    if-eqz p0, :cond_25

    invoke-virtual {p0}, Lo/PropertyBasedCreatorCaseInsensitiveMap;->write()I

    move-result p0

    goto :goto_26

    :cond_25
    const/4 p0, -0x1

    :goto_26
    move v2, p0

    .line 253
    invoke-interface {p2}, Lo/PropertyBasedObjectIdGenerator;->RemoteActionCompatParcelizer()Lo/appendReferring;

    move-result-object v3

    .line 254
    invoke-interface {p2}, Lo/PropertyBasedObjectIdGenerator;->write()Lo/PropertyBasedCreatorCaseInsensitiveMap;

    move-result-object v4

    .line 256
    invoke-interface {p1}, Lo/JsonReadFeature;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Lo/isEnumImplType;

    if-eqz p1, :cond_3a

    check-cast p0, Lo/isEnumImplType;

    goto :goto_3b

    :cond_3a
    const/4 p0, 0x0

    :goto_3b
    move-object v6, p0

    .line 257
    invoke-interface {p2}, Lo/PropertyBasedObjectIdGenerator;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v7

    .line 250
    new-instance p0, Lo/complete;

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lo/complete;-><init>(Ljava/lang/String;ILo/appendReferring;Lo/PropertyBasedCreatorCaseInsensitiveMap;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final write(Landroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;
    .registers 3

    const/4 v0, 0x0

    .line 510
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    const-string v1, ""

    invoke-static {p0, v1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroidx/compose/ui/platform/ComposeView;

    .line 511
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    instance-of v0, p0, Lo/CoercionInputShape;

    if-eqz v0, :cond_17

    check-cast p0, Lo/CoercionInputShape;

    goto :goto_18

    :cond_17
    const/4 p0, 0x0

    :goto_18
    if-eqz p0, :cond_1d

    invoke-interface {p0}, Lo/CoercionInputShape;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4()V

    .line 515
    :cond_1d
    sget-object p0, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {p0}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->read()V

    .line 516
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method private static final write(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;
    .registers 7

    .line 477
    :try_start_0
    sget-object v0, Lo/injection;->INSTANCE:Lo/injection;

    .line 481
    invoke-static {p3, p4}, Lo/_deserializeMissingToken;->write(Ljava/lang/Class;I)[Ljava/lang/Object;

    move-result-object p3

    array-length p4, p3

    invoke-static {p3, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    .line 477
    invoke-virtual {v0, p0, p1, p2, p3}, Lo/injection;->read(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;[Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_0 .. :try_end_e} :catchall_11

    .line 497
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0

    :catchall_11
    move-exception p0

    move-object p1, p0

    .line 491
    :goto_13
    instance-of p2, p1, Ljava/lang/ReflectiveOperationException;

    if-eqz p2, :cond_1f

    .line 492
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_1f

    move-object p1, p2

    goto :goto_13

    .line 494
    :cond_1f
    iget-object p2, p5, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatSearchResultReceiver:Lo/handleTypePropertyValue;

    invoke-virtual {p2, p1}, Lo/handleTypePropertyValue;->read(Ljava/lang/Throwable;)V

    .line 495
    throw p0
.end method

.method public static synthetic write(Lo/getCreatedOnDateMs;Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IJLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;
    .registers 10

    .line 702
    invoke-static/range {p0 .. p9}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer(Lo/getCreatedOnDateMs;Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IJLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic write(Lo/setCurrentName;)Lo/getShowPopup;
    .registers 1

    .line 708
    invoke-static {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Lo/setCurrentName;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

.method private final write()V
    .registers 9

    .line 317
    iget-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onCustomAction:Lo/hasDelegatingCreator;

    invoke-interface {v0}, Lo/hasDelegatingCreator;->write()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 649
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 650
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 651
    check-cast v2, Lo/JsonReadContext;

    .line 317
    invoke-static {v2}, Lo/startBuilding;->IconCompatParcelizer(Lo/JsonReadContext;)Lo/ObjectIdReferenceProperty;

    move-result-object v2

    .line 651
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 652
    :cond_2d
    check-cast v1, Ljava/util/List;

    .line 320
    check-cast v1, Ljava/lang/Iterable;

    .line 653
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 654
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 655
    check-cast v2, Lo/ObjectIdReferenceProperty;

    .line 322
    new-instance v3, Lo/addDoubleCreator;

    invoke-direct {v3, p0}, Lo/addDoubleCreator;-><init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;)V

    invoke-static {v2, v3}, Lo/_deserializeMissingToken;->AudioAttributesCompatParcelizer(Lo/ObjectIdReferenceProperty;Lo/getAnswerMap;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 656
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 665
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5e
    :goto_5e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 664
    check-cast v4, Lo/ObjectIdReferenceProperty;

    .line 330
    invoke-virtual {v4}, Lo/ObjectIdReferenceProperty;->write()Lo/appendReferring;

    move-result-object v5

    invoke-direct {p0, v4, v5}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Lo/ObjectIdReferenceProperty;Lo/appendReferring;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_97

    .line 331
    invoke-virtual {v4}, Lo/ObjectIdReferenceProperty;->read()Ljava/util/Collection;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_96

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo/ObjectIdReferenceProperty;

    .line 332
    invoke-virtual {v4}, Lo/ObjectIdReferenceProperty;->write()Lo/appendReferring;

    move-result-object v7

    invoke-direct {p0, v6, v7}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Lo/ObjectIdReferenceProperty;Lo/appendReferring;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_7e

    move-object v5, v6

    goto :goto_97

    :cond_96
    const/4 v5, 0x0

    :cond_97
    :goto_97
    if-eqz v5, :cond_5e

    .line 664
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5e

    .line 668
    :cond_9d
    check-cast v3, Ljava/util/List;

    .line 656
    check-cast v3, Ljava/lang/Iterable;

    .line 669
    invoke-static {v0, v3}, Lo/IntermediateLoginResponseBody;->IconCompatParcelizer(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_3c

    .line 671
    :cond_a5
    check-cast v0, Ljava/util/List;

    .line 319
    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->designInfoList:Ljava/util/List;

    return-void
.end method

.method private final write(Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/MagicModuleSubmissionRequestBody<",
            "-",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "-",
            "Ljava/lang/Integer;",
            "Lo/getShowPopup;",
            ">;",
            "Lo/_handleUnrecognizedCharacterEscape;",
            "I)V"
        }
    .end annotation

    const v0, -0xfcf8b87

    .line 406
    invoke-interface {p2, v0}, Lo/_handleUnrecognizedCharacterEscape;->write(I)Lo/_handleUnrecognizedCharacterEscape;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v1, :cond_18

    invoke-interface {p2, p1}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    move v1, v2

    goto :goto_16

    :cond_15
    move v1, v3

    :goto_16
    or-int/2addr v1, p3

    goto :goto_19

    :cond_18
    move v1, p3

    :goto_19
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_29

    invoke-interface {p2, p0}, Lo/_handleUnrecognizedCharacterEscape;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_26

    const/16 v4, 0x20

    goto :goto_28

    :cond_26
    const/16 v4, 0x10

    :goto_28
    or-int/2addr v1, v4

    :cond_29
    and-int/lit8 v4, v1, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_33

    move v4, v7

    goto :goto_34

    :cond_33
    move v4, v6

    :goto_34
    and-int/lit8 v5, v1, 0x1

    invoke-interface {p2, v4, v5}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v4

    if-eqz v4, :cond_a9

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v4

    if-eqz v4, :cond_48

    const/4 v4, -0x1

    const-string v5, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:405)"

    invoke-static {v0, v1, v4, v5}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 412
    :cond_48
    invoke-static {}, Lo/getDefaultNullValueSerializer;->AudioAttributesImplApi21Parcelizer()Lo/CharacterEscapes;

    move-result-object v0

    new-instance v1, Lo/hasDefaultCreator;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v1, v4}, Lo/hasDefaultCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lo/CharacterEscapes;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Lo/ContentReference;

    move-result-object v0

    .line 413
    invoke-static {}, Lo/getDefaultNullValueSerializer;->AudioAttributesImplBaseParcelizer()Lo/CharacterEscapes;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lo/getCreatorIndex;->write(Landroid/content/Context;)Lo/_reportMissingSetter$write;

    move-result-object v4

    invoke-virtual {v1, v4}, Lo/CharacterEscapes;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Lo/ContentReference;

    move-result-object v1

    .line 414
    sget-object v4, Lo/MediaSessionCompatQueueItem;->INSTANCE:Lo/MediaSessionCompatQueueItem;

    iget-object v4, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read:Landroidx/compose/ui/tooling/ComposeViewAdapter$read;

    check-cast v4, Lo/onSetShuffleMode;

    invoke-static {v4}, Lo/MediaSessionCompatQueueItem;->read(Lo/onSetShuffleMode;)Lo/ContentReference;

    move-result-object v4

    .line 415
    sget-object v5, Lo/PlaybackStateCompat;->INSTANCE:Lo/PlaybackStateCompat;

    iget-object v5, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$write;

    check-cast v5, Lo/_init_lambda3;

    invoke-static {v5}, Lo/PlaybackStateCompat;->AudioAttributesCompatParcelizer(Lo/_init_lambda3;)Lo/ContentReference;

    move-result-object v5

    new-array v2, v2, [Lo/ContentReference;

    aput-object v0, v2, v6

    aput-object v1, v2, v7

    aput-object v4, v2, v3

    const/4 v0, 0x3

    aput-object v5, v2, v0

    .line 416
    new-instance v0, Lo/addBigIntegerCreator;

    invoke-direct {v0, p0, p1}, Lo/addBigIntegerCreator;-><init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;)V

    const/16 v1, 0x36

    const v3, -0x3424f847    # -2.8708722E7f

    invoke-static {v3, v7, v0, p2, v1}, Lo/multiplyFft;->AudioAttributesCompatParcelizer(IZLjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/FastIntegerMathUInt128;

    move-result-object v0

    check-cast v0, Lo/MagicModuleSubmissionRequestBody;

    sget v1, Lo/ContentReference;->write:I

    or-int/lit8 v1, v1, 0x30

    .line 411
    invoke-static {v2, v0, p2, v1}, Lo/resetAsNaN;->AudioAttributesCompatParcelizer([Lo/ContentReference;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_ac

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    goto :goto_ac

    .line 406
    :cond_a9
    invoke-interface {p2}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    .line 419
    :cond_ac
    :goto_ac
    invoke-interface {p2}, Lo/_handleUnrecognizedCharacterEscape;->MediaBrowserCompatSearchResultReceiver()Lo/releaseNameCopyBuffer;

    move-result-object p2

    if-eqz p2, :cond_ba

    new-instance v0, Lo/CreatorCollector;

    invoke-direct {v0, p0, p1, p3}, Lo/CreatorCollector;-><init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;I)V

    invoke-interface {p2, v0}, Lo/releaseNameCopyBuffer;->read(Lo/MagicModuleSubmissionRequestBody;)V

    :cond_ba
    return-void
.end method

.method public static synthetic write(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/ObjectIdReferenceProperty;)Z
    .registers 2

    .line 698
    invoke-static {p0, p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/ObjectIdReferenceProperty;)Z

    move-result p0

    return p0
.end method

.method public static synthetic write$default(Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZLjava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;ILjava/lang/Object;)V
    .registers 31

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    move-object v6, v2

    goto :goto_b

    :cond_9
    move-object/from16 v6, p3

    :goto_b
    and-int/lit8 v1, v0, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_12

    move v7, v3

    goto :goto_14

    :cond_12
    move/from16 v7, p4

    :goto_14
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1a

    move v8, v3

    goto :goto_1c

    :cond_1a
    move/from16 v8, p5

    :goto_1c
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_22

    move v9, v3

    goto :goto_24

    :cond_22
    move/from16 v9, p6

    :goto_24
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2c

    const-wide/16 v4, -0x1

    move-wide v10, v4

    goto :goto_2e

    :cond_2c
    move-wide/from16 v10, p7

    :goto_2e
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_34

    move v12, v3

    goto :goto_36

    :cond_34
    move/from16 v12, p9

    :goto_36
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3c

    move-object v13, v2

    goto :goto_3e

    :cond_3c
    move-object/from16 v13, p10

    :goto_3e
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_49

    .line 454
    new-instance v1, Lo/addIntCreator;

    invoke-direct {v1}, Lo/addIntCreator;-><init>()V

    move-object v14, v1

    goto :goto_4b

    :cond_49
    move-object/from16 v14, p11

    :goto_4b
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_56

    .line 455
    new-instance v0, Lo/addPropertyCreator;

    invoke-direct {v0}, Lo/addPropertyCreator;-><init>()V

    move-object v15, v0

    goto :goto_58

    :cond_56
    move-object/from16 v15, p12

    :goto_58
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    .line 444
    invoke-virtual/range {v3 .. v15}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZLjava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V

    return-void
.end method


# virtual methods
.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 8

    .line 376
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 378
    iget-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaDescriptionCompat:Lo/getCreatedOnDateMs;

    invoke-interface {v0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    .line 379
    iget-boolean v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_82

    .line 383
    iget-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->viewInfos:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 676
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 677
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 678
    check-cast v2, Lo/complete;

    .line 384
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, Lo/complete;->write()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v3, v2}, Lo/IntermediateLoginResponseBody;->AudioAttributesCompatParcelizer(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 679
    invoke-static {v1, v2}, Lo/IntermediateLoginResponseBody;->IconCompatParcelizer(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1b

    .line 681
    :cond_3d
    check-cast v1, Ljava/util/List;

    .line 676
    check-cast v1, Ljava/lang/Iterable;

    .line 682
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_45
    :goto_45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_82

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/complete;

    .line 386
    invoke-virtual {v1}, Lo/complete;->AudioAttributesImplApi21Parcelizer()Z

    move-result v2

    if-eqz v2, :cond_45

    .line 390
    invoke-virtual {v1}, Lo/complete;->read()Lo/appendReferring;

    move-result-object v2

    invoke-virtual {v2}, Lo/appendReferring;->RemoteActionCompatParcelizer()I

    move-result v2

    .line 391
    invoke-virtual {v1}, Lo/complete;->read()Lo/appendReferring;

    move-result-object v3

    invoke-virtual {v3}, Lo/appendReferring;->AudioAttributesImplApi26Parcelizer()I

    move-result v3

    .line 392
    invoke-virtual {v1}, Lo/complete;->read()Lo/appendReferring;

    move-result-object v4

    invoke-virtual {v4}, Lo/appendReferring;->AudioAttributesImplApi21Parcelizer()I

    move-result v4

    .line 393
    invoke-virtual {v1}, Lo/complete;->read()Lo/appendReferring;

    move-result-object v1

    invoke-virtual {v1}, Lo/appendReferring;->AudioAttributesCompatParcelizer()I

    move-result v1

    .line 389
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v2, v3, v4, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 395
    iget-object v1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_45

    :cond_82
    return-void
.end method

.method public final getClock$ui_tooling()Lo/JavaUtilCollectionsDeserializers;
    .registers 1

    .line 402
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->clock:Lo/JavaUtilCollectionsDeserializers;

    return-object p0
.end method

.method public final getDesignInfoList$ui_tooling()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 143
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->designInfoList:Ljava/util/List;

    return-object p0
.end method

.method public final getViewInfos$ui_tooling()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo/complete;",
            ">;"
        }
    .end annotation

    .line 142
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->viewInfos:Ljava/util/List;

    return-object p0
.end method

.method protected final onAttachedToWindow()V
    .registers 3

    .line 293
    iget-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatItemReceiver:Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    check-cast v1, Lo/hasGetter;

    invoke-static {v0, v1}, Lo/isCreatorVisible;->IconCompatParcelizer(Landroid/view/View;Lo/hasGetter;)V

    .line 294
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    return-void
.end method

.method protected final onLayout(ZIIII)V
    .registers 6

    .line 277
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 281
    iget-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatSearchResultReceiver:Lo/handleTypePropertyValue;

    invoke-virtual {p1}, Lo/handleTypePropertyValue;->read()V

    .line 283
    invoke-direct {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi21Parcelizer()V

    .line 284
    iget-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1f

    .line 285
    invoke-direct {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer()V

    .line 286
    iget-boolean p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaMetadataCompat:Z

    if-eqz p1, :cond_1f

    .line 287
    invoke-direct {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write()V

    :cond_1f
    return-void
.end method

.method public final setClock$ui_tooling(Lo/JavaUtilCollectionsDeserializers;)V
    .registers 2

    .line 402
    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->clock:Lo/JavaUtilCollectionsDeserializers;

    return-void
.end method

.method public final setDesignInfoList$ui_tooling(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 143
    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->designInfoList:Ljava/util/List;

    return-void
.end method

.method public final setViewInfos$ui_tooling(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/complete;",
            ">;)V"
        }
    .end annotation

    .line 142
    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;->viewInfos:Ljava/util/List;

    return-void
.end method

.method public final write(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZLjava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V
    .registers 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lo/PropertyValueMap<",
            "*>;>;IZZJZ",
            "Ljava/lang/String;",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    move-object v9, p0

    move/from16 v0, p5

    .line 457
    iput-boolean v0, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi26Parcelizer:Z

    move/from16 v0, p6

    .line 458
    iput-boolean v0, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplBaseParcelizer:Z

    move-object v4, p2

    .line 459
    iput-object v4, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    move/from16 v0, p9

    .line 460
    iput-boolean v0, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaMetadataCompat:Z

    if-nez p10, :cond_15

    .line 461
    const-string v0, ""

    goto :goto_17

    :cond_15
    move-object/from16 v0, p10

    :goto_17
    iput-object v0, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RatingCompat:Ljava/lang/String;

    move-object/from16 v0, p12

    .line 462
    iput-object v0, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaDescriptionCompat:Lo/getCreatedOnDateMs;

    .line 465
    new-instance v10, Lo/_isEnumValueOf;

    move-object v0, v10

    move-object/from16 v1, p11

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move-wide/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lo/_isEnumValueOf;-><init>(Lo/getCreatedOnDateMs;Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IJ)V

    const v0, -0x273cd64e

    const/4 v1, 0x1

    invoke-static {v0, v1, v10}, Lo/multiplyFft;->IconCompatParcelizer(IZLjava/lang/Object;)Lo/FastIntegerMathUInt128;

    move-result-object v0

    check-cast v0, Lo/MagicModuleSubmissionRequestBody;

    .line 464
    iput-object v0, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->onAddQueueItem:Lo/MagicModuleSubmissionRequestBody;

    .line 521
    iget-object v1, v9, Landroidx/compose/ui/tooling/ComposeViewAdapter;->MediaBrowserCompatItemReceiver:Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v1, v0}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lo/MagicModuleSubmissionRequestBody;)V

    .line 522
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.AudioAttributesCompatParcelizer (androidx.compose.ui.tooling.ComposeViewAdapter$AudioAttributesCompatParcelizer)
.class public final Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/PieChart;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\tR\u0014\u0010\u0005\u001a\u00020\u000b8WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0006"
    }
    d2 = {
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;",
        "Lo/PieChart;",
        "Lo/getSetterUnchecked;",
        "read",
        "Lo/getSetterUnchecked;",
        "AudioAttributesCompatParcelizer",
        "()Lo/getSetterUnchecked;",
        "RemoteActionCompatParcelizer",
        "Lo/setRenderer;",
        "Lo/setRenderer;",
        "write",
        "Lo/setOnChartValueSelectedListener;",
        "getSavedStateRegistry",
        "()Lo/setOnChartValueSelectedListener;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/setRenderer;

.field private final read:Lo/getSetterUnchecked;


# direct methods
.method constructor <init>()V
    .registers 4

    .line 591
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 592
    sget-object v0, Lo/getSetterUnchecked;->read:Lo/getSetterUnchecked$AudioAttributesCompatParcelizer;

    move-object v0, p0

    check-cast v0, Lo/hasGetter;

    invoke-static {v0}, Lo/getSetterUnchecked$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Lo/hasGetter;)Lo/getSetterUnchecked;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;->read:Lo/getSetterUnchecked;

    .line 594
    sget-object v1, Lo/setRenderer;->AudioAttributesCompatParcelizer:Lo/setRenderer$RemoteActionCompatParcelizer;

    move-object v1, p0

    check-cast v1, Lo/PieChart;

    invoke-static {v1}, Lo/setRenderer$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Lo/PieChart;)Lo/setRenderer;

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v2}, Lo/setRenderer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/setRenderer;

    .line 597
    sget-object p0, Lo/anyIgnorals$write;->write:Lo/anyIgnorals$write;

    invoke-virtual {v0, p0}, Lo/getSetterUnchecked;->RemoteActionCompatParcelizer(Lo/anyIgnorals$write;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/getSetterUnchecked;
    .registers 1

    .line 592
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;->read:Lo/getSetterUnchecked;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Lo/getSetterUnchecked;
    .registers 1

    .line 604
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;->read:Lo/getSetterUnchecked;

    return-object p0
.end method

.method public final synthetic getLifecycle()Lo/anyIgnorals;
    .registers 1

    .line 591
    invoke-virtual {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/getSetterUnchecked;

    move-result-object p0

    check-cast p0, Lo/anyIgnorals;

    return-object p0
.end method

.method public final getSavedStateRegistry()Lo/setOnChartValueSelectedListener;
    .registers 1

    .line 601
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/setRenderer;

    invoke-virtual {p0}, Lo/setRenderer;->read()Lo/setOnChartValueSelectedListener;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.AudioAttributesImplBaseParcelizer (androidx.compose.ui.tooling.ComposeViewAdapter$AudioAttributesImplBaseParcelizer)
.class final synthetic Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesImplBaseParcelizer;
.super Lo/MagicModuleRepositoryImpl_Factory;
.source "SourceFile"

# interfaces
.implements Lo/getMagicModuleStat;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesImplApi21Parcelizer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleRepositoryImpl_Factory;",
        "Lo/getMagicModuleStat<",
        "Lo/JsonReadFeature;",
        "Lo/PropertyBasedObjectIdGenerator;",
        "Ljava/util/List<",
        "+",
        "Lo/complete;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lo/complete;",
        ">;",
        "Lo/complete;",
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


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const/4 v1, 0x4

    .line 267
    const-class v3, Landroidx/compose/ui/tooling/ComposeViewAdapter;

    const-string v4, "write"

    const-string v5, "write(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lo/MagicModuleRepositoryImpl_Factory;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/JsonReadFeature;",
            "Lo/PropertyBasedObjectIdGenerator;",
            "Ljava/util/List<",
            "Lo/complete;",
            ">;",
            "Ljava/util/List<",
            "Lo/complete;",
            ">;)",
            "Lo/complete;"
        }
    .end annotation

    .line 266
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesImplBaseParcelizer;->AudioAttributesImplApi26Parcelizer:Ljava/lang/Object;

    check-cast p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 266
    check-cast p1, Lo/JsonReadFeature;

    check-cast p2, Lo/PropertyBasedObjectIdGenerator;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesImplBaseParcelizer;->IconCompatParcelizer(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.IconCompatParcelizer (androidx.compose.ui.tooling.ComposeViewAdapter$IconCompatParcelizer)
.class public final Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/TypeResolutionContext;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\u0008\u001a\u00020\u00028\u0017X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0004\u001a\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;",
        "Lo/TypeResolutionContext;",
        "Lo/hasMixIns;",
        "RemoteActionCompatParcelizer",
        "Lo/hasMixIns;",
        "IconCompatParcelizer",
        "getViewModelStore",
        "()Lo/hasMixIns;",
        "read"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final IconCompatParcelizer:Lo/hasMixIns;

.field private final RemoteActionCompatParcelizer:Lo/hasMixIns;


# direct methods
.method constructor <init>()V
    .registers 2

    .line 608
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 609
    new-instance v0, Lo/hasMixIns;

    invoke-direct {v0}, Lo/hasMixIns;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;->RemoteActionCompatParcelizer:Lo/hasMixIns;

    .line 611
    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;->IconCompatParcelizer:Lo/hasMixIns;

    return-void
.end method


# virtual methods
.method public final getViewModelStore()Lo/hasMixIns;
    .registers 1

    .line 611
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;->IconCompatParcelizer:Lo/hasMixIns;

    return-object p0
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.MediaBrowserCompatItemReceiver (androidx.compose.ui.tooling.ComposeViewAdapter$MediaBrowserCompatItemReceiver)
.class final synthetic Landroidx/compose/ui/tooling/ComposeViewAdapter$MediaBrowserCompatItemReceiver;
.super Lo/MagicModuleRepositoryImpl_Factory;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleRepositoryImpl_Factory;",
        "Lo/getCreatedOnDateMs<",
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


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const/4 v1, 0x0

    .line 305
    const-class v3, Landroidx/compose/ui/tooling/ComposeViewAdapter;

    const-string v4, "requestLayout"

    const-string v5, "requestLayout()V"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lo/MagicModuleRepositoryImpl_Factory;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 304
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$MediaBrowserCompatItemReceiver;->AudioAttributesImplApi26Parcelizer:Ljava/lang/Object;

    check-cast p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;

    invoke-virtual {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->requestLayout()V

    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 304
    invoke-virtual {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.RemoteActionCompatParcelizer (androidx.compose.ui.tooling.ComposeViewAdapter$RemoteActionCompatParcelizer)
.class final synthetic Landroidx/compose/ui/tooling/ComposeViewAdapter$RemoteActionCompatParcelizer;
.super Lo/MagicModuleUseCaseDefaultImpls;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
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


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 8

    .line 305
    const-class v2, Landroidx/compose/ui/tooling/ComposeViewAdapter;

    const-string v3, "clock"

    const-string v4, "getClock$ui_tooling()Lo/JavaUtilCollectionsDeserializers;"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lo/MagicModuleUseCaseDefaultImpls;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final read()Ljava/lang/Object;
    .registers 1

    .line 304
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Ljava/lang/Object;

    check-cast p0, Landroidx/compose/ui/tooling/ComposeViewAdapter;

    invoke-virtual {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->getClock$ui_tooling()Lo/JavaUtilCollectionsDeserializers;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.read (androidx.compose.ui.tooling.ComposeViewAdapter$read)
.class public final Landroidx/compose/ui/tooling/ComposeViewAdapter$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/onSetShuffleMode;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$read;",
        "Lo/onSetShuffleMode;",
        "Lo/onSetRating;",
        "RemoteActionCompatParcelizer",
        "Lo/onSetRating;",
        "getOnBackPressedDispatcher",
        "()Lo/onSetRating;",
        "Lo/getSetterUnchecked;",
        "AudioAttributesCompatParcelizer",
        "()Lo/getSetterUnchecked;",
        "read"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

.field private final RemoteActionCompatParcelizer:Lo/onSetRating;


# direct methods
.method constructor <init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;)V
    .registers 4

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    .line 615
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 616
    new-instance p1, Lo/onSetRating;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, v0}, Lo/onSetRating;-><init>(Ljava/lang/Runnable;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    iput-object p1, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;->RemoteActionCompatParcelizer:Lo/onSetRating;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/getSetterUnchecked;
    .registers 1

    .line 619
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    invoke-static {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;)Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/getSetterUnchecked;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic getLifecycle()Lo/anyIgnorals;
    .registers 1

    .line 615
    invoke-virtual {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;->AudioAttributesCompatParcelizer()Lo/getSetterUnchecked;

    move-result-object p0

    check-cast p0, Lo/anyIgnorals;

    return-object p0
.end method

.method public final getOnBackPressedDispatcher()Lo/onSetRating;
    .registers 1

    .line 616
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$read;->RemoteActionCompatParcelizer:Lo/onSetRating;

    return-object p0
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.write (androidx.compose.ui.tooling.ComposeViewAdapter$write)
.class public final Landroidx/compose/ui/tooling/ComposeViewAdapter$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/_init_lambda3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$write;",
        "Lo/_init_lambda3;",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;",
        "IconCompatParcelizer",
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;",
        "write",
        "()Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;",
        "AudioAttributesCompatParcelizer"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;


# direct methods
.method constructor <init>()V
    .registers 2

    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 625
    new-instance v0, Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$write;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;

    return-void
.end method


# virtual methods
.method public final synthetic getActivityResultRegistry()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    .registers 1

    .line 623
    invoke-virtual {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter$write;->write()Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;

    move-result-object p0

    check-cast p0, Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

    return-object p0
.end method

.method public final write()Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;
    .registers 1

    .line 624
    iget-object p0, p0, Landroidx/compose/ui/tooling/ComposeViewAdapter$write;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;

    return-object p0
.end method

###### Class androidx.compose.ui.tooling.ComposeViewAdapter.write.AudioAttributesCompatParcelizer (androidx.compose.ui.tooling.ComposeViewAdapter$write$AudioAttributesCompatParcelizer)
.class public final Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;
.super Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/ComposeViewAdapter$write;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\n\u0018\u00002\u00020\u0001JU\u0010\r\u001a\u00020\u000c\"\n\u0008\u0000\u0010\u0003*\u0004\u0018\u00010\u0002\"\n\u0008\u0001\u0010\u0004*\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\t\u001a\u00028\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;",
        "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;",
        "",
        "I",
        "O",
        "",
        "p0",
        "Lo/accessaddObserverForBackInvoker;",
        "p1",
        "p2",
        "Lo/_checkFloatToStringCoercion;",
        "p3",
        "",
        "RemoteActionCompatParcelizer",
        "(ILo/accessaddObserverForBackInvoker;Ljava/lang/Object;Lo/_checkFloatToStringCoercion;)V"
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

    .line 625
    invoke-direct {p0}, Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(ILo/accessaddObserverForBackInvoker;Ljava/lang/Object;Lo/_checkFloatToStringCoercion;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(I",
            "Lo/accessaddObserverForBackInvoker<",
            "TI;TO;>;TI;",
            "Lo/_checkFloatToStringCoercion;",
            ")V"
        }
    .end annotation

    .line 632
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Calling launch() is not supported in Preview"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class kotlin.CreatorCollector (o.CreatorCollector)
.class public final synthetic Lo/CreatorCollector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

.field public final synthetic IconCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

.field public final synthetic RemoteActionCompatParcelizer:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;I)V
    .registers 4

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/CreatorCollector;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iput-object p2, p0, Lo/CreatorCollector;->IconCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

    iput p3, p0, Lo/CreatorCollector;->RemoteActionCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 0
    iget-object v0, p0, Lo/CreatorCollector;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iget-object v1, p0, Lo/CreatorCollector;->IconCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

    iget p0, p0, Lo/CreatorCollector;->RemoteActionCompatParcelizer:I

    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v0, v1, p0, p1, p2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;ILo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin._computeDelegateType (o._computeDelegateType)
.class public final synthetic Lo/_computeDelegateType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    invoke-static {}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer()Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin._isEnumValueOf (o._isEnumValueOf)
.class public final synthetic Lo/_isEnumValueOf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

.field public final synthetic AudioAttributesImplBaseParcelizer:J

.field public final synthetic IconCompatParcelizer:Ljava/lang/String;

.field public final synthetic MediaBrowserCompatCustomActionResultReceiver:I

.field public final synthetic RemoteActionCompatParcelizer:Lo/getCreatedOnDateMs;

.field public final synthetic read:Ljava/lang/String;

.field public final synthetic write:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lo/getCreatedOnDateMs;Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IJ)V
    .registers 9

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_isEnumValueOf;->RemoteActionCompatParcelizer:Lo/getCreatedOnDateMs;

    iput-object p2, p0, Lo/_isEnumValueOf;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iput-object p3, p0, Lo/_isEnumValueOf;->read:Ljava/lang/String;

    iput-object p4, p0, Lo/_isEnumValueOf;->IconCompatParcelizer:Ljava/lang/String;

    iput-object p5, p0, Lo/_isEnumValueOf;->write:Ljava/lang/Class;

    iput p6, p0, Lo/_isEnumValueOf;->MediaBrowserCompatCustomActionResultReceiver:I

    iput-wide p7, p0, Lo/_isEnumValueOf;->AudioAttributesImplBaseParcelizer:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 13

    .line 0
    iget-object v0, p0, Lo/_isEnumValueOf;->RemoteActionCompatParcelizer:Lo/getCreatedOnDateMs;

    iget-object v1, p0, Lo/_isEnumValueOf;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iget-object v2, p0, Lo/_isEnumValueOf;->read:Ljava/lang/String;

    iget-object v3, p0, Lo/_isEnumValueOf;->IconCompatParcelizer:Ljava/lang/String;

    iget-object v4, p0, Lo/_isEnumValueOf;->write:Ljava/lang/Class;

    iget v5, p0, Lo/_isEnumValueOf;->MediaBrowserCompatCustomActionResultReceiver:I

    iget-wide v6, p0, Lo/_isEnumValueOf;->AudioAttributesImplBaseParcelizer:J

    move-object v8, p1

    check-cast v8, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Lo/getCreatedOnDateMs;Landroidx/compose/ui/tooling/ComposeViewAdapter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IJLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin._reportDuplicateCreator (o._reportDuplicateCreator)
.class public final synthetic Lo/_reportDuplicateCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:I

.field public final synthetic AudioAttributesImplApi21Parcelizer:J

.field public final synthetic IconCompatParcelizer:Ljava/lang/String;

.field public final synthetic RemoteActionCompatParcelizer:Ljava/lang/Class;

.field public final synthetic read:Ljava/lang/String;

.field public final synthetic write:Landroidx/compose/ui/tooling/ComposeViewAdapter;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;J)V
    .registers 8

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_reportDuplicateCreator;->read:Ljava/lang/String;

    iput-object p2, p0, Lo/_reportDuplicateCreator;->IconCompatParcelizer:Ljava/lang/String;

    iput-object p3, p0, Lo/_reportDuplicateCreator;->RemoteActionCompatParcelizer:Ljava/lang/Class;

    iput p4, p0, Lo/_reportDuplicateCreator;->AudioAttributesCompatParcelizer:I

    iput-object p5, p0, Lo/_reportDuplicateCreator;->write:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iput-wide p6, p0, Lo/_reportDuplicateCreator;->AudioAttributesImplApi21Parcelizer:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    .line 0
    iget-object v0, p0, Lo/_reportDuplicateCreator;->read:Ljava/lang/String;

    iget-object v1, p0, Lo/_reportDuplicateCreator;->IconCompatParcelizer:Ljava/lang/String;

    iget-object v2, p0, Lo/_reportDuplicateCreator;->RemoteActionCompatParcelizer:Ljava/lang/Class;

    iget v3, p0, Lo/_reportDuplicateCreator;->AudioAttributesCompatParcelizer:I

    iget-object v4, p0, Lo/_reportDuplicateCreator;->write:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iget-wide v5, p0, Lo/_reportDuplicateCreator;->AudioAttributesImplApi21Parcelizer:J

    move-object v7, p1

    check-cast v7, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;JLo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addBigDecimalCreator (o.addBigDecimalCreator)
.class public final synthetic Lo/addBigDecimalCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 0
    check-cast p1, Lo/setCurrentName;

    invoke-static {p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Lo/setCurrentName;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addBigIntegerCreator (o.addBigIntegerCreator)
.class public final synthetic Lo/addBigIntegerCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

.field public final synthetic IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/addBigIntegerCreator;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iput-object p2, p0, Lo/addBigIntegerCreator;->AudioAttributesCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 0
    iget-object v0, p0, Lo/addBigIntegerCreator;->IconCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    iget-object p0, p0, Lo/addBigIntegerCreator;->AudioAttributesCompatParcelizer:Lo/MagicModuleSubmissionRequestBody;

    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {v0, p0, p1, p2}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addBooleanCreator (o.addBooleanCreator)
.class public final synthetic Lo/addBooleanCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getModuleData;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 0
    check-cast p1, Lo/setCurrentName;

    check-cast p2, Lo/complete;

    check-cast p3, Ljava/util/List;

    invoke-static {p1, p2, p3}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->IconCompatParcelizer(Lo/setCurrentName;Lo/complete;Ljava/util/List;)Lo/complete;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addDelegatingCreator (o.addDelegatingCreator)
.class public final synthetic Lo/addDelegatingCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/addDelegatingCreator;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/addDelegatingCreator;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    invoke-static {p0}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read(Landroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addDoubleCreator (o.addDoubleCreator)
.class public final synthetic Lo/addDoubleCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# instance fields
.field public final synthetic RemoteActionCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/tooling/ComposeViewAdapter;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/addDoubleCreator;->RemoteActionCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 0
    iget-object p0, p0, Lo/addDoubleCreator;->RemoteActionCompatParcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    check-cast p1, Lo/ObjectIdReferenceProperty;

    invoke-static {p0, p1}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->write(Landroidx/compose/ui/tooling/ComposeViewAdapter;Lo/ObjectIdReferenceProperty;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addIntCreator (o.addIntCreator)
.class public final synthetic Lo/addIntCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    invoke-static {}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->read()Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addLongCreator (o.addLongCreator)
.class public final synthetic Lo/addLongCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Ljava/lang/String;

.field public final synthetic AudioAttributesImplApi21Parcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

.field public final synthetic IconCompatParcelizer:Ljava/lang/Class;

.field public final synthetic RemoteActionCompatParcelizer:I

.field public final synthetic read:Lo/_handleUnrecognizedCharacterEscape;

.field public final synthetic write:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;)V
    .registers 7

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/addLongCreator;->write:Ljava/lang/String;

    iput-object p2, p0, Lo/addLongCreator;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iput-object p3, p0, Lo/addLongCreator;->read:Lo/_handleUnrecognizedCharacterEscape;

    iput-object p4, p0, Lo/addLongCreator;->IconCompatParcelizer:Ljava/lang/Class;

    iput p5, p0, Lo/addLongCreator;->RemoteActionCompatParcelizer:I

    iput-object p6, p0, Lo/addLongCreator;->AudioAttributesImplApi21Parcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 7

    .line 0
    iget-object v0, p0, Lo/addLongCreator;->write:Ljava/lang/String;

    iget-object v1, p0, Lo/addLongCreator;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p0, Lo/addLongCreator;->read:Lo/_handleUnrecognizedCharacterEscape;

    iget-object v3, p0, Lo/addLongCreator;->IconCompatParcelizer:Ljava/lang/Class;

    iget v4, p0, Lo/addLongCreator;->RemoteActionCompatParcelizer:I

    iget-object v5, p0, Lo/addLongCreator;->AudioAttributesImplApi21Parcelizer:Landroidx/compose/ui/tooling/ComposeViewAdapter;

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;Ljava/lang/Class;ILandroidx/compose/ui/tooling/ComposeViewAdapter;)Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.addPropertyCreator (o.addPropertyCreator)
.class public final synthetic Lo/addPropertyCreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    invoke-static {}, Landroidx/compose/ui/tooling/ComposeViewAdapter;->RemoteActionCompatParcelizer()Lo/getShowPopup;

    move-result-object p0

    return-object p0
.end method
