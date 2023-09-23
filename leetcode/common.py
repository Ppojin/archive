from typing import Optional


class TreeNode:
  def __init__(self, val=0, left=None, right=None):
    self.val = val
    self.left = left
    self.right = right
  def __str__(self):
    return f'<{self.val}, {self.left}, {self.right}>'

def build_binary_tree(values = [], index = 0):
  if len(values) == 0:
    raise Exception('Node list is empty')
  
  if index > len(values) - 1:
    raise Exception('Index out of range')
  
  root = TreeNode(values[index])
  if 2*index+1 < len(values) and values[2*index+1] != None:
    root.left = build_binary_tree(values, 2*index+1)
  if 2*index+2 < len(values) and values[2*index+2] != None:
    root.right = build_binary_tree(values, 2*index+2)
  return root
