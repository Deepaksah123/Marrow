###### Class androidx.compose.ui.platform.AbstractComposeView (androidx.compose.ui.platform.AbstractComposeView)
.class public abstract Landroidx/compose/ui/platform/AbstractComposeView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\n*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u0013J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0010\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ7\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u0008!\u0010\"J7\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0010\u00a2\u0006\u0004\u0008\u001d\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u0019\u0010*\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010)H\u0016\u00a2\u0006\u0004\u0008*\u0010+J!\u0010*\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008*\u0010,J)\u0010*\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008*\u0010-J#\u0010*\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010)2\u0008\u0010\u0005\u001a\u0004\u0018\u00010.H\u0016\u00a2\u0006\u0004\u0008*\u0010/J+\u0010*\u001a\u00020\u000b2\u0008\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010.H\u0016\u00a2\u0006\u0004\u0008*\u00100J+\u00101\u001a\u00020\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010.H\u0014\u00a2\u0006\u0004\u00081\u00102J3\u00101\u001a\u00020\u001e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010.2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014\u00a2\u0006\u0004\u00081\u00103J\u000f\u00104\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u00084\u0010&R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u00106R(\u0010\u0019\u001a\u0004\u0018\u0001072\u0008\u0010\u0003\u001a\u0004\u0018\u0001078\u0002@CX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0017\u00108\"\u0004\u0008\u0014\u00109R\u0018\u0010\u001d\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010;R(\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0002@CX\u0083\u000e\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\"\u0004\u0008\u001d\u0010\rR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010>8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010?R\u0014\u0010@\u001a\u00020\u001e8UX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010&R*\u0010A\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e8\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010&\"\u0004\u0008D\u0010(R$\u0010I\u001a\u00020E2\u0006\u0010\u0003\u001a\u00020E8G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010$R\u0016\u0010<\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010BR\u0018\u0010K\u001a\u00020\u001e*\u00020\n8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010JR\u0016\u0010\u0017\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010B"
    }
    d2 = {
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "Landroid/view/ViewGroup;",
        "Landroid/content/Context;",
        "p0",
        "Landroid/util/AttributeSet;",
        "p1",
        "",
        "p2",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Lo/convertNumberToLong;",
        "",
        "setParentCompositionContext",
        "(Lo/convertNumberToLong;)V",
        "Lo/withPropertyNamingStrategy;",
        "setViewCompositionStrategy",
        "(Lo/withPropertyNamingStrategy;)V",
        "IconCompatParcelizer",
        "(Lo/_handleUnrecognizedCharacterEscape;I)V",
        "()V",
        "read",
        "AudioAttributesCompatParcelizer",
        "(Lo/convertNumberToLong;)Lo/convertNumberToLong;",
        "AudioAttributesImplApi26Parcelizer",
        "()Lo/convertNumberToLong;",
        "RemoteActionCompatParcelizer",
        "onAttachedToWindow",
        "onMeasure",
        "(II)V",
        "write",
        "",
        "p3",
        "p4",
        "onLayout",
        "(ZIIII)V",
        "onRtlPropertiesChanged",
        "(I)V",
        "isTransitionGroup",
        "()Z",
        "setTransitionGroup",
        "(Z)V",
        "Landroid/view/View;",
        "addView",
        "(Landroid/view/View;)V",
        "(Landroid/view/View;I)V",
        "(Landroid/view/View;II)V",
        "Landroid/view/ViewGroup$LayoutParams;",
        "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V",
        "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V",
        "addViewInLayout",
        "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z",
        "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z",
        "shouldDelayChildPressedState",
        "Ljava/lang/ref/WeakReference;",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/os/IBinder;",
        "Landroid/os/IBinder;",
        "(Landroid/os/IBinder;)V",
        "Lo/createChildArrayContext;",
        "Lo/createChildArrayContext;",
        "MediaBrowserCompatItemReceiver",
        "Lo/convertNumberToLong;",
        "Lkotlin/Function0;",
        "Lo/getCreatedOnDateMs;",
        "AudioAttributesImplApi21Parcelizer",
        "showLayoutBounds",
        "Z",
        "getShowLayoutBounds",
        "setShowLayoutBounds",
        "Lo/findContentValueSerializer;",
        "getAutoClearFocusBehavior-4UtRPd4",
        "()I",
        "setAutoClearFocusBehavior-17tfJxM",
        "autoClearFocusBehavior",
        "(Lo/convertNumberToLong;)Z",
        "MediaBrowserCompatCustomActionResultReceiver"
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
.field private AudioAttributesCompatParcelizer:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lo/convertNumberToLong;",
            ">;"
        }
    .end annotation
.end field

.field private AudioAttributesImplApi26Parcelizer:Landroid/os/IBinder;

.field private IconCompatParcelizer:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatItemReceiver:Lo/convertNumberToLong;

.field private RemoteActionCompatParcelizer:Z

.field private read:Z

.field private showLayoutBounds:Z

.field private write:Lo/createChildArrayContext;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 413
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 9

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 414
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 62
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 63
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    const/4 p1, 0x1

    .line 64
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->setImportantForAccessibility(I)V

    .line 131
    sget-object p1, Lo/withPropertyNamingStrategy;->read:Lo/withPropertyNamingStrategy$read;

    invoke-virtual {p1}, Lo/withPropertyNamingStrategy$read;->read()Lo/withPropertyNamingStrategy;

    move-result-object p1

    invoke-interface {p1, p0}, Lo/withPropertyNamingStrategy;->RemoteActionCompatParcelizer(Landroidx/compose/ui/platform/AbstractComposeView;)Lo/getCreatedOnDateMs;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->IconCompatParcelizer:Lo/getCreatedOnDateMs;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 58
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final AudioAttributesCompatParcelizer(Lo/convertNumberToLong;)Lo/convertNumberToLong;
    .registers 4

    .line 237
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->RemoteActionCompatParcelizer(Lo/convertNumberToLong;)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object v0, p1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_12

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer:Ljava/lang/ref/WeakReference;

    :cond_12
    return-object p1
.end method

.method private final AudioAttributesCompatParcelizer()V
    .registers 6

    .line 262
    iget-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->write:Lo/createChildArrayContext;

    if-nez v0, :cond_27

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 264
    :try_start_6
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->RemoteActionCompatParcelizer:Z

    .line 265
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesImplApi26Parcelizer()Lo/convertNumberToLong;

    move-result-object v2

    new-instance v3, Landroidx/compose/ui/platform/AbstractComposeView$2;

    invoke-direct {v3, p0}, Landroidx/compose/ui/platform/AbstractComposeView$2;-><init>(Landroidx/compose/ui/platform/AbstractComposeView;)V

    const v4, -0x271bffc0

    invoke-static {v4, v1, v3}, Lo/multiplyFft;->IconCompatParcelizer(IZLjava/lang/Object;)Lo/FastIntegerMathUInt128;

    move-result-object v1

    check-cast v1, Lo/MagicModuleSubmissionRequestBody;

    invoke-static {p0, v2, v1}, Lo/getIsIgnoredType;->read(Landroidx/compose/ui/platform/AbstractComposeView;Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)Lo/createChildArrayContext;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->write:Lo/createChildArrayContext;
    :try_end_20
    .catchall {:try_start_6 .. :try_end_20} :catchall_23

    .line 267
    iput-boolean v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->RemoteActionCompatParcelizer:Z

    return-void

    :catchall_23
    move-exception v1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->RemoteActionCompatParcelizer:Z

    throw v1

    :cond_27
    return-void
.end method

.method private final AudioAttributesImplApi26Parcelizer()Lo/convertNumberToLong;
    .registers 5

    .line 255
    iget-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->MediaBrowserCompatItemReceiver:Lo/convertNumberToLong;

    if-nez v0, :cond_38

    .line 256
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lo/ConfigOverride;->write(Landroid/view/View;)Lo/convertNumberToLong;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_13

    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer(Lo/convertNumberToLong;)Lo/convertNumberToLong;

    move-result-object v1

    goto :goto_14

    :cond_13
    move-object v1, v2

    :goto_14
    if-nez v1, :cond_37

    .line 257
    iget-object v1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_29

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/convertNumberToLong;

    if-eqz v1, :cond_29

    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/AbstractComposeView;->RemoteActionCompatParcelizer(Lo/convertNumberToLong;)Z

    move-result v3

    if-eqz v3, :cond_29

    move-object v2, v1

    :cond_29
    if-nez v2, :cond_36

    .line 258
    invoke-static {v0}, Lo/ConfigOverride;->AudioAttributesCompatParcelizer(Landroid/view/View;)Lo/_truncate;

    move-result-object v0

    check-cast v0, Lo/convertNumberToLong;

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer(Lo/convertNumberToLong;)Lo/convertNumberToLong;

    move-result-object p0

    return-object p0

    :cond_36
    return-object v2

    :cond_37
    return-object v1

    :cond_38
    return-object v0
.end method

.method private final RemoteActionCompatParcelizer(Lo/convertNumberToLong;)Z
    .registers 2

    .line 230
    instance-of p0, p1, Lo/_truncate;

    if-eqz p0, :cond_1c

    check-cast p1, Lo/_truncate;

    invoke-virtual {p1}, Lo/_truncate;->RatingCompat()Lo/setUpdatedStatus;

    move-result-object p0

    invoke-interface {p0}, Lo/setUpdatedStatus;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/_truncate$IconCompatParcelizer;

    sget-object p1, Lo/_truncate$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:Lo/_truncate$IconCompatParcelizer;

    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p0

    if-gtz p0, :cond_1c

    const/4 p0, 0x0

    return p0

    :cond_1c
    const/4 p0, 0x1

    return p0
.end method

.method private final read()V
    .registers 3

    .line 215
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_5

    return-void

    .line 217
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot add views to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    .line 217
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "; only Compose content is supported"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 216
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final read(Landroid/os/IBinder;)V
    .registers 3

    .line 84
    iget-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesImplApi26Parcelizer:Landroid/os/IBinder;

    if-eq v0, p1, :cond_9

    .line 85
    iput-object p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesImplApi26Parcelizer:Landroid/os/IBinder;

    const/4 p1, 0x0

    .line 86
    iput-object p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer:Ljava/lang/ref/WeakReference;

    :cond_9
    return-void
.end method

.method private final write(Lo/convertNumberToLong;)V
    .registers 3

    .line 100
    iget-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->MediaBrowserCompatItemReceiver:Lo/convertNumberToLong;

    if-eq v0, p1, :cond_1d

    .line 101
    iput-object p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->MediaBrowserCompatItemReceiver:Lo/convertNumberToLong;

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    .line 103
    iput-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer:Ljava/lang/ref/WeakReference;

    .line 105
    :cond_b
    iget-object p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->write:Lo/createChildArrayContext;

    if-eqz p1, :cond_1d

    .line 107
    invoke-interface {p1}, Lo/createChildArrayContext;->RemoteActionCompatParcelizer()V

    .line 108
    iput-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->write:Lo/createChildArrayContext;

    .line 111
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1d

    .line 112
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer()V

    :cond_1d
    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()V
    .registers 2

    .line 205
    iget-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->MediaBrowserCompatItemReceiver:Lo/convertNumberToLong;

    if-nez v0, :cond_17

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_17

    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 209
    :cond_17
    :goto_17
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public abstract IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 2

    .line 277
    iget-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->write:Lo/createChildArrayContext;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lo/createChildArrayContext;->RemoteActionCompatParcelizer()V

    :cond_7
    const/4 v0, 0x0

    .line 278
    iput-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->write:Lo/createChildArrayContext;

    .line 279
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public addView(Landroid/view/View;)V
    .registers 2

    .line 376
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->read()V

    .line 377
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .registers 3

    .line 381
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->read()V

    .line 382
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;II)V
    .registers 4

    .line 386
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->read()V

    .line 387
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    .line 396
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->read()V

    .line 397
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 3

    .line 391
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->read()V

    .line 392
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
    .registers 4

    .line 401
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->read()V

    .line 402
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    move-result p0

    return p0
.end method

.method protected addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z
    .registers 5

    .line 411
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->read()V

    .line 412
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    move-result p0

    return p0
.end method

.method public final getAutoClearFocusBehavior-4UtRPd4()I
    .registers 2

    .line 180
    sget v0, Lo/_handleApos$AudioAttributesCompatParcelizer;->auto_clear_focus_behavior_tag:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lo/findContentValueSerializer;

    if-eqz v0, :cond_d

    check-cast p0, Lo/findContentValueSerializer;

    goto :goto_e

    :cond_d
    const/4 p0, 0x0

    :goto_e
    if-eqz p0, :cond_15

    invoke-virtual {p0}, Lo/findContentValueSerializer;->AudioAttributesCompatParcelizer()I

    move-result p0

    return p0

    .line 181
    :cond_15
    sget-object p0, Lo/findContentValueSerializer;->IconCompatParcelizer:Lo/findContentValueSerializer$IconCompatParcelizer;

    invoke-virtual {p0}, Lo/findContentValueSerializer$IconCompatParcelizer;->AudioAttributesCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public final getShowLayoutBounds()Z
    .registers 1

    .line 166
    iget-boolean p0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->showLayoutBounds:Z

    return p0
.end method

.method public isTransitionGroup()Z
    .registers 2

    .line 366
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->read:Z

    if-eqz v0, :cond_c

    invoke-super {p0}, Landroid/view/ViewGroup;->isTransitionGroup()Z

    move-result p0

    if-nez p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

.method public onAttachedToWindow()V
    .registers 2

    .line 290
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 292
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AbstractComposeView;->read(Landroid/os/IBinder;)V

    .line 294
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->write()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 295
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer()V

    :cond_13
    return-void
.end method

.method protected final onLayout(ZIIII)V
    .registers 6

    .line 325
    invoke-virtual/range {p0 .. p5}, Landroidx/compose/ui/platform/AbstractComposeView;->write(ZIIII)V

    return-void
.end method

.method protected final onMeasure(II)V
    .registers 3

    .line 300
    invoke-direct {p0}, Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer()V

    .line 301
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AbstractComposeView;->write(II)V

    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 3

    const/4 v0, 0x0

    .line 348
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    :cond_a
    return-void
.end method

.method public final setAutoClearFocusBehavior-17tfJxM(I)V
    .registers 3

    .line 183
    sget v0, Lo/_handleApos$AudioAttributesCompatParcelizer;->auto_clear_focus_behavior_tag:I

    invoke-static {p1}, Lo/findContentValueSerializer;->RemoteActionCompatParcelizer(I)Lo/findContentValueSerializer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final setParentCompositionContext(Lo/convertNumberToLong;)V
    .registers 2

    .line 124
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->write(Lo/convertNumberToLong;)V

    return-void
.end method

.method public final setShowLayoutBounds(Z)V
    .registers 3

    .line 168
    iput-boolean p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->showLayoutBounds:Z

    const/4 v0, 0x0

    .line 169
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_e

    check-cast p0, Lo/_configureGenerator;

    invoke-interface {p0, p1}, Lo/_configureGenerator;->setShowLayoutBounds(Z)V

    :cond_e
    return-void
.end method

.method public setTransitionGroup(Z)V
    .registers 2

    .line 369
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    const/4 p1, 0x1

    .line 370
    iput-boolean p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->read:Z

    return-void
.end method

.method public final setViewCompositionStrategy(Lo/withPropertyNamingStrategy;)V
    .registers 3

    .line 143
    iget-object v0, p0, Landroidx/compose/ui/platform/AbstractComposeView;->IconCompatParcelizer:Lo/getCreatedOnDateMs;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    .line 144
    :cond_7
    invoke-interface {p1, p0}, Lo/withPropertyNamingStrategy;->RemoteActionCompatParcelizer(Landroidx/compose/ui/platform/AbstractComposeView;)Lo/getCreatedOnDateMs;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/AbstractComposeView;->IconCompatParcelizer:Lo/getCreatedOnDateMs;

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public write(II)V
    .registers 8

    const/4 v0, 0x0

    .line 306
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_b

    .line 308
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    return-void

    .line 312
    :cond_b
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 313
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 315
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    invoke-static {v2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 316
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 314
    invoke-virtual {v1, p1, p2}, Landroid/view/View;->measure(II)V

    .line 319
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    .line 320
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr p1, p2

    add-int/2addr p1, v0

    add-int/2addr v1, v2

    add-int/2addr v1, v3

    .line 318
    invoke-virtual {p0, p1, v1}, Landroidx/compose/ui/platform/AbstractComposeView;->setMeasuredDimension(II)V

    return-void
.end method

.method public write(ZIIII)V
    .registers 9

    const/4 p1, 0x0

    .line 334
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1e

    .line 336
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 337
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 338
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 339
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr p4, p2

    sub-int/2addr p4, v2

    sub-int/2addr p5, p3

    sub-int/2addr p5, p0

    .line 335
    invoke-virtual {p1, v0, v1, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_1e
    return-void
.end method

.method protected write()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.compose.ui.platform.AbstractComposeView.AnonymousClass2 (androidx.compose.ui.platform.AbstractComposeView$2)
.class final Landroidx/compose/ui/platform/AbstractComposeView$2;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AbstractComposeView;->AudioAttributesCompatParcelizer()V
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
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "RemoteActionCompatParcelizer",
        "(Lo/_handleUnrecognizedCharacterEscape;I)V"
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
.field final synthetic write:Landroidx/compose/ui/platform/AbstractComposeView;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/AbstractComposeView;)V
    .registers 2

    .line 266
    iput-object p1, p0, Landroidx/compose/ui/platform/AbstractComposeView$2;->write:Landroidx/compose/ui/platform/AbstractComposeView;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V
    .registers 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    move v0, v2

    :goto_9
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Lo/_handleUnrecognizedCharacterEscape;->RemoteActionCompatParcelizer(ZI)Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:264)"

    const v3, -0x271bffc0

    invoke-static {v3, p2, v0, v1}, Lo/_validJsonValueList;->AudioAttributesCompatParcelizer(IIILjava/lang/String;)V

    .line 265
    :cond_20
    iget-object p0, p0, Landroidx/compose/ui/platform/AbstractComposeView$2;->write:Landroidx/compose/ui/platform/AbstractComposeView;

    invoke-virtual {p0, p1, v2}, Landroidx/compose/ui/platform/AbstractComposeView;->IconCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi26Parcelizer()Z

    move-result p0

    if-eqz p0, :cond_2e

    invoke-static {}, Lo/_validJsonValueList;->AudioAttributesImplApi21Parcelizer()V

    :cond_2e
    return-void

    :cond_2f
    invoke-interface {p1}, Lo/_handleUnrecognizedCharacterEscape;->onPrepareFromSearch()V

    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 265
    check-cast p1, Lo/_handleUnrecognizedCharacterEscape;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AbstractComposeView$2;->RemoteActionCompatParcelizer(Lo/_handleUnrecognizedCharacterEscape;I)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method
