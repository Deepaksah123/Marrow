###### Class androidx.constraintlayout.helper.widget.MotionPlaceholder (androidx.constraintlayout.helper.widget.MotionPlaceholder)
.class public Landroidx/constraintlayout/helper/widget/MotionPlaceholder;
.super Landroidx/constraintlayout/widget/VirtualLayout;
.source "SourceFile"


# instance fields
.field private AudioAttributesImplBaseParcelizer:Lo/_readAndUpdateStringKeyMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 34
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 38
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 42
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 2

    .line 78
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/VirtualLayout;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    .line 79
    new-instance p1, Lo/_readAndUpdateStringKeyMap;

    invoke-direct {p1}, Lo/_readAndUpdateStringKeyMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->RemoteActionCompatParcelizer:Lo/JsonNodeDeserializer;

    .line 80
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintHelper;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public final IconCompatParcelizer(Lo/JsonNodeDeserializer;Landroid/util/SparseArray;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/JsonNodeDeserializer;",
            "Landroid/util/SparseArray<",
            "Lo/JdkDeserializers;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onMeasure(II)V
    .registers 4

    .line 52
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/MotionPlaceholder;->AudioAttributesImplBaseParcelizer:Lo/_readAndUpdateStringKeyMap;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/constraintlayout/widget/VirtualLayout;->read(Lo/_readAndBindStringKeyMap;II)V

    return-void
.end method

.method public final read(Lo/_readAndBindStringKeyMap;II)V
    .registers 6

    .line 57
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 58
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 59
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 60
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p3

    if-eqz p1, :cond_21

    .line 62
    invoke-virtual {p1, v0, p2, v1, p3}, Lo/_readAndBindStringKeyMap;->read(IIII)V

    .line 63
    invoke-virtual {p1}, Lo/_readAndBindStringKeyMap;->RemoteActionCompatParcelizer()I

    move-result p2

    invoke-virtual {p1}, Lo/_readAndBindStringKeyMap;->IconCompatParcelizer()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/helper/widget/MotionPlaceholder;->setMeasuredDimension(II)V

    return-void

    :cond_21
    const/4 p1, 0x0

    .line 65
    invoke-virtual {p0, p1, p1}, Landroidx/constraintlayout/helper/widget/MotionPlaceholder;->setMeasuredDimension(II)V

    return-void
.end method
