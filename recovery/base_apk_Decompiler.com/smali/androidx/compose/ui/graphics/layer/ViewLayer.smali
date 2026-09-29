###### Class androidx.compose.ui.graphics.layer.ViewLayer (androidx.compose.ui.graphics.layer.ViewLayer)
.class public final Landroidx/compose/ui/graphics/layer/ViewLayer;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/layer/ViewLayer$read;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ;\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0013H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\u001b8\u0006\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\"\u0010#\u001a\u00020\u00108\u0007@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008#\u0010\u0012\"\u0004\u0008%\u0010&R\u0018\u0010 \u001a\u0004\u0018\u00010\'8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R*\u0010*\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108\u0001@AX\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010$\u001a\u0004\u0008+\u0010\u0012\"\u0004\u0008,\u0010&R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/layer/ViewLayer;",
        "Landroid/view/View;",
        "Lo/bufferMapProperty;",
        "p0",
        "Lo/tryToResolveUnresolved;",
        "p1",
        "Lo/hasAnyGetter;",
        "p2",
        "Lkotlin/Function1;",
        "Lo/findSetterInfo;",
        "",
        "p3",
        "setDrawParams",
        "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/hasAnyGetter;Lo/getAnswerMap;)V",
        "invalidate",
        "()V",
        "",
        "hasOverlappingRendering",
        "()Z",
        "Landroid/graphics/Canvas;",
        "dispatchDraw",
        "(Landroid/graphics/Canvas;)V",
        "",
        "p4",
        "onLayout",
        "(ZIIII)V",
        "forceLayout",
        "Lo/createFlattened;",
        "RemoteActionCompatParcelizer",
        "Lo/createFlattened;",
        "read",
        "Lo/findRenameByField;",
        "IconCompatParcelizer",
        "Lo/findRenameByField;",
        "AudioAttributesCompatParcelizer",
        "isInvalidated",
        "Z",
        "setInvalidated",
        "(Z)V",
        "Landroid/graphics/Outline;",
        "AudioAttributesImplApi26Parcelizer",
        "Landroid/graphics/Outline;",
        "canUseCompositingLayer",
        "getCanUseCompositingLayer$ui_graphics",
        "setCanUseCompositingLayer$ui_graphics",
        "MediaBrowserCompatItemReceiver",
        "Lo/bufferMapProperty;",
        "write",
        "MediaBrowserCompatCustomActionResultReceiver",
        "Lo/tryToResolveUnresolved;",
        "AudioAttributesImplBaseParcelizer",
        "Lo/getAnswerMap;",
        "AudioAttributesImplApi21Parcelizer",
        "Lo/hasAnyGetter;"
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
.field private static final AudioAttributesCompatParcelizer:Landroid/view/ViewOutlineProvider;

.field public static final read:Landroidx/compose/ui/graphics/layer/ViewLayer$read;

.field public static final write:I


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Lo/hasAnyGetter;

.field private AudioAttributesImplApi26Parcelizer:Landroid/graphics/Outline;

.field private AudioAttributesImplBaseParcelizer:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-",
            "Lo/findSetterInfo;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final IconCompatParcelizer:Lo/findRenameByField;

.field private MediaBrowserCompatCustomActionResultReceiver:Lo/tryToResolveUnresolved;

.field private MediaBrowserCompatItemReceiver:Lo/bufferMapProperty;

.field private final RemoteActionCompatParcelizer:Lo/createFlattened;

.field private canUseCompositingLayer:Z

.field private isInvalidated:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/ui/graphics/layer/ViewLayer$read;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/layer/ViewLayer$read;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->read:Landroidx/compose/ui/graphics/layer/ViewLayer$read;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->write:I

    .line 144
    new-instance v0, Landroidx/compose/ui/graphics/layer/ViewLayer$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Landroidx/compose/ui/graphics/layer/ViewLayer$RemoteActionCompatParcelizer;-><init>()V

    check-cast v0, Landroid/view/ViewOutlineProvider;

    sput-object v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->AudioAttributesCompatParcelizer:Landroid/view/ViewOutlineProvider;

    return-void
.end method

.method public static final synthetic read(Landroidx/compose/ui/graphics/layer/ViewLayer;)Landroid/graphics/Outline;
    .registers 1

    .line 56
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Outline;

    return-object p0
.end method


# virtual methods
.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 22

    move-object/from16 v0, p0

    .line 122
    iget-object v1, v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->RemoteActionCompatParcelizer:Lo/createFlattened;

    .line 584
    invoke-virtual {v1}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object v2

    invoke-virtual {v2}, Lo/charBufferLength;->read()Landroid/graphics/Canvas;

    move-result-object v2

    .line 585
    invoke-virtual {v1}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Lo/charBufferLength;->write(Landroid/graphics/Canvas;)V

    .line 586
    invoke-virtual {v1}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object v3

    check-cast v3, Lo/JsonParserDelegate;

    .line 123
    iget-object v4, v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->IconCompatParcelizer:Lo/findRenameByField;

    check-cast v4, Lo/findSetterInfo;

    .line 124
    iget-object v5, v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->MediaBrowserCompatItemReceiver:Lo/bufferMapProperty;

    .line 125
    iget-object v6, v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->MediaBrowserCompatCustomActionResultReceiver:Lo/tryToResolveUnresolved;

    .line 127
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    .line 588
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v9, v7

    .line 589
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    const/4 v11, 0x0

    int-to-long v12, v11

    const/16 v14, 0x20

    shl-long/2addr v12, v14

    const/4 v15, -0x1

    move-wide/from16 v16, v12

    int-to-long v11, v15

    const/16 v13, 0x3f

    shr-long v18, v11, v13

    shl-long v18, v18, v14

    sub-long v11, v11, v18

    or-long v11, v16, v11

    and-long/2addr v7, v11

    shl-long/2addr v9, v14

    or-long/2addr v7, v9

    .line 587
    invoke-static {v7, v8}, Lo/calloc;->write(J)J

    move-result-wide v7

    .line 128
    iget-object v9, v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->AudioAttributesImplApi21Parcelizer:Lo/hasAnyGetter;

    .line 129
    iget-object v10, v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->AudioAttributesImplBaseParcelizer:Lo/getAnswerMap;

    .line 591
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v11

    invoke-interface {v11}, Lo/findSerializationTyping;->read()Lo/bufferMapProperty;

    move-result-object v11

    .line 592
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v12

    invoke-interface {v12}, Lo/findSerializationTyping;->write()Lo/tryToResolveUnresolved;

    move-result-object v12

    .line 593
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v13

    invoke-interface {v13}, Lo/findSerializationTyping;->IconCompatParcelizer()Lo/JsonParserDelegate;

    move-result-object v13

    .line 594
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v14

    invoke-interface {v14}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer()J

    move-result-wide v14

    .line 595
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v16

    move-object/from16 v17, v2

    invoke-interface/range {v16 .. v16}, Lo/findSerializationTyping;->RemoteActionCompatParcelizer()Lo/hasAnyGetter;

    move-result-object v2

    .line 596
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v0

    .line 597
    invoke-interface {v0, v5}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/bufferMapProperty;)V

    .line 598
    invoke-interface {v0, v6}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/tryToResolveUnresolved;)V

    .line 599
    invoke-interface {v0, v3}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/JsonParserDelegate;)V

    .line 600
    invoke-interface {v0, v7, v8}, Lo/findSerializationTyping;->IconCompatParcelizer(J)V

    .line 601
    invoke-interface {v0, v9}, Lo/findSerializationTyping;->write(Lo/hasAnyGetter;)V

    .line 603
    invoke-interface {v3}, Lo/JsonParserDelegate;->IconCompatParcelizer()V

    .line 605
    :try_start_95
    invoke-interface {v10, v4}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_98
    .catchall {:try_start_95 .. :try_end_98} :catchall_bd

    .line 607
    invoke-interface {v3}, Lo/JsonParserDelegate;->AudioAttributesCompatParcelizer()V

    .line 608
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v0

    .line 609
    invoke-interface {v0, v11}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/bufferMapProperty;)V

    .line 610
    invoke-interface {v0, v12}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/tryToResolveUnresolved;)V

    .line 611
    invoke-interface {v0, v13}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/JsonParserDelegate;)V

    .line 612
    invoke-interface {v0, v14, v15}, Lo/findSerializationTyping;->IconCompatParcelizer(J)V

    .line 613
    invoke-interface {v0, v2}, Lo/findSerializationTyping;->write(Lo/hasAnyGetter;)V

    .line 617
    invoke-virtual {v1}, Lo/createFlattened;->read()Lo/charBufferLength;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/charBufferLength;->write(Landroid/graphics/Canvas;)V

    const/4 v1, 0x0

    move-object/from16 v0, p0

    .line 132
    iput-boolean v1, v0, Landroidx/compose/ui/graphics/layer/ViewLayer;->isInvalidated:Z

    return-void

    :catchall_bd
    move-exception v0

    move-object v1, v0

    .line 607
    invoke-interface {v3}, Lo/JsonParserDelegate;->AudioAttributesCompatParcelizer()V

    .line 608
    invoke-interface {v4}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object v0

    .line 609
    invoke-interface {v0, v11}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/bufferMapProperty;)V

    .line 610
    invoke-interface {v0, v12}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/tryToResolveUnresolved;)V

    .line 611
    invoke-interface {v0, v13}, Lo/findSerializationTyping;->AudioAttributesCompatParcelizer(Lo/JsonParserDelegate;)V

    .line 612
    invoke-interface {v0, v14, v15}, Lo/findSerializationTyping;->IconCompatParcelizer(J)V

    .line 613
    invoke-interface {v0, v2}, Lo/findSerializationTyping;->write(Lo/hasAnyGetter;)V

    .line 608
    throw v1
.end method

.method public final forceLayout()V
    .registers 1

    return-void
.end method

.method public final getCanUseCompositingLayer$ui_graphics()Z
    .registers 1

    .line 80
    iget-boolean p0, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->canUseCompositingLayer:Z

    return p0
.end method

.method public final hasOverlappingRendering()Z
    .registers 1

    .line 118
    iget-boolean p0, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->canUseCompositingLayer:Z

    return p0
.end method

.method public final invalidate()V
    .registers 2

    .line 111
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->isInvalidated:Z

    if-nez v0, :cond_a

    const/4 v0, 0x1

    .line 112
    iput-boolean v0, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->isInvalidated:Z

    .line 113
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    :cond_a
    return-void
.end method

.method public final isInvalidated()Z
    .registers 1

    .line 62
    iget-boolean p0, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->isInvalidated:Z

    return p0
.end method

.method protected final onLayout(ZIIII)V
    .registers 6

    return-void
.end method

.method public final setCanUseCompositingLayer$ui_graphics(Z)V
    .registers 3

    .line 82
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->canUseCompositingLayer:Z

    if-eq v0, p1, :cond_9

    .line 83
    iput-boolean p1, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->canUseCompositingLayer:Z

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_9
    return-void
.end method

.method public final setDrawParams(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/hasAnyGetter;Lo/getAnswerMap;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/bufferMapProperty;",
            "Lo/tryToResolveUnresolved;",
            "Lo/hasAnyGetter;",
            "Lo/getAnswerMap<",
            "-",
            "Lo/findSetterInfo;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 99
    iput-object p1, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->MediaBrowserCompatItemReceiver:Lo/bufferMapProperty;

    .line 100
    iput-object p2, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->MediaBrowserCompatCustomActionResultReceiver:Lo/tryToResolveUnresolved;

    .line 101
    iput-object p4, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->AudioAttributesImplBaseParcelizer:Lo/getAnswerMap;

    .line 102
    iput-object p3, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->AudioAttributesImplApi21Parcelizer:Lo/hasAnyGetter;

    return-void
.end method

.method public final setInvalidated(Z)V
    .registers 2

    .line 62
    iput-boolean p1, p0, Landroidx/compose/ui/graphics/layer/ViewLayer;->isInvalidated:Z

    return-void
.end method

###### Class androidx.compose.ui.graphics.layer.ViewLayer.RemoteActionCompatParcelizer (androidx.compose.ui.graphics.layer.ViewLayer$RemoteActionCompatParcelizer)
.class public final Landroidx/compose/ui/graphics/layer/ViewLayer$RemoteActionCompatParcelizer;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/graphics/layer/ViewLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/layer/ViewLayer$RemoteActionCompatParcelizer;",
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

    .line 144
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 3

    .line 146
    instance-of p0, p1, Landroidx/compose/ui/graphics/layer/ViewLayer;

    if-eqz p0, :cond_f

    .line 147
    check-cast p1, Landroidx/compose/ui/graphics/layer/ViewLayer;

    invoke-static {p1}, Landroidx/compose/ui/graphics/layer/ViewLayer;->read(Landroidx/compose/ui/graphics/layer/ViewLayer;)Landroid/graphics/Outline;

    move-result-object p0

    if-eqz p0, :cond_f

    invoke-virtual {p2, p0}, Landroid/graphics/Outline;->set(Landroid/graphics/Outline;)V

    :cond_f
    return-void
.end method

###### Class androidx.compose.ui.graphics.layer.ViewLayer.Companion (androidx.compose.ui.graphics.layer.ViewLayer$read)
.class public final Landroidx/compose/ui/graphics/layer/ViewLayer$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/graphics/layer/ViewLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/layer/ViewLayer$read;",
        "",
        "<init>",
        "()V",
        "Landroid/view/ViewOutlineProvider;",
        "AudioAttributesCompatParcelizer",
        "Landroid/view/ViewOutlineProvider;",
        "RemoteActionCompatParcelizer"
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

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 143
    invoke-direct {p0}, Landroidx/compose/ui/graphics/layer/ViewLayer$read;-><init>()V

    return-void
.end method
